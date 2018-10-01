package kosta_java.ex1001.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 실제 DB관련 실행 문장(CRUD 작업)
 * */
public class SqlCRUDExam {
    
    /**
     * 검색하기
     * select empno, ename, job, sal, hiredate from emp;
     * */
    
    public void selectAll() {
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        //로드 연결 실행 닫기
        try {
            con = DbUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select empno, ename, job, sal, hiredate from emp");
            
            while(rs.next()) {
                //열을 
                int empno = rs.getInt("EMPNO");
                String ename = rs.getString(2);
                String job = rs.getString("job");
                int sal = rs.getInt(4);
                String hiredate = rs.getString("hiredate");
                
                System.out.printf("%d,%s,%s,%d,%s\n",empno, ename,job,sal,hiredate);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            DbUtil.dbClose(rs, st, con);
        }
    }
    
    /**
     * 삭제하기
     * */
    
    /**
     * 등록하기
     * */
    
}
