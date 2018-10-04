package kosta_java.ex1004.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kosta_java.ex1001.db.DbUtil;

public class TransactionDAO {
  /**
   * 계좌이체 기능 구현
   * */
    public void transfer(String inputAccount, String outputAccount, int money) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DbUtil.getConnection();
            con.setAutoCommit(false);
            ps = con.prepareStatement("update bank set balance = balance - ? where account = ?");
            ps.setInt(1, money);
            ps.setString(2, outputAccount);
            ps.executeUpdate();
            result = ps.executeUpdate();
            if(result > 0 ) {
                // 입금하기
                con.prepareStatement("update bank set balance = balance + ? where account = ?");
                ps.setInt(1, money);
                ps.setString(2, inputAccount);
                result = ps.executeUpdate();
                if(result > 0 ) {
                    
                    ps = con.prepareStatement("select balance from bank where account =?");
                    ps.setString(1, inputAccount);
                    rs = ps.executeQuery();
                    if(rs.next()) {
                        int balance = rs.getInt(1);
                        if(balance > 1000) {
                            System.out.println("입금계좌 총 잔액이 1000원을 초과하여 계좌 이체 실패");
                            con.rollback();
                        } else {
                            con.commit();
                            System.out.println("계좌이체 성공하였습니다.");
                        }
                    }
                } else {
                    System.out.println("입금하기에[서 문제가 생겨서 계좌 이체에 실패하였습니다");
                    con.rollback();
                }
            } else {
                System.out.println("출금이 되지 않아 계좌이체 실패입니다.");
                con.rollback();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            
            try {con.rollback();} catch (SQLException e1) {e1.printStackTrace();}
        
        } finally {
            DbUtil.dbClose(rs, ps, con);
        }
    }
    
    public static void main(String[] args) {
        TransactionDAO dao = new TransactionDAO();
        System.out.println("--1. 출금계좌 오류----");
//      dao.transfer("A02", "A05",200);//입금, 출금, 금액
        
        System.out.println("--2. 입금계좌 오류----");
        //dao.transfer("A04", "A01",200);//입금, 출금, 금액
        
        
        System.out.println("--3. 입금계좌의 총액 1000원 이상인경우----");
    //      dao.transfer("A02", "A01",700);//입금, 출금, 금액
        
        System.out.println("--4. 성공----------");
    dao.transfer("A02", "A01",100);//입금, 출금, 금액
    }
}






