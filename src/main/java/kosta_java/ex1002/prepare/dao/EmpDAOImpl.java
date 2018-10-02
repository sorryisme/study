package kosta_java.ex1002.prepare.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kosta_java.ex1001.db.DbUtil;
import kosta_java.ex1002.dto.EmpVo;

public class EmpDAOImpl implements EmpDAO{

	
	/**
	    * 레코드 삽입
	    * insert into emp(empno,ename,job,sal,hiredate)
	    * values(?,?,?,?,sysdate)
	*/
	@Override
	public int empInsert(EmpVo vo) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into emp(empno, ename, job, sal, hiredate)" + 
				"values(?,?,?,?,sysdate)";		
		int result = 0;
		
		try {
			System.out.println("sql = "+sql);
			// 연결
			con = DbUtil.getConnection();
			
			// 실행
			ps = con.prepareStatement(sql);
			ps.setInt(1, vo.getEmpno());
			ps.setString(2, vo.getEname());
			ps.setString(3, vo.getJob());
			ps.setInt(4, vo.getSal());
			result = ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DbUtil.dbClose(ps, con);
			}
		
		return result;
	}
	
	/**
	 * empno(사원번호) 중복체크기능
	 * @return : true이면 중복, false이면 사용가능
	 * 
	 * select empno from emp where empno=?
	 * */

	@Override
	public boolean duplicateByEmpno(int empno) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from emp where empno = ?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, empno);
			rs = ps.executeQuery();
			return rs.next();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.dbClose(rs,ps,con);

		}
		return false;

	}

	@Override
	public EmpVo selectByEmpno(int empno) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =  null;
		EmpVo vo = null;
		String sql = "select * from emp where empno = ?";
		
		try {
			
			System.out.println("sql = "+sql);
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, empno);
			rs = ps.executeQuery();
			if(rs.next()) {
				vo = new EmpVo(rs.getInt("empno"),rs.getString("ename"),
						rs.getString("job"),rs.getInt("sal"),rs.getString("hiredate"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.dbClose(rs,ps,con);
		}
		
		return vo;
	}

	@Override
	public List<EmpVo> selectAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =  null;
		List<EmpVo> list = new ArrayList<>();
		String sql = "select * from emp";
		
		try {
			
			System.out.println("sql = "+sql);
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				list.add(new EmpVo(rs.getInt("empno"),rs.getString("ename"),
						rs.getString("job"),rs.getInt("sal"),rs.getString("hiredate")));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.dbClose(rs,ps,con);
		}		
		return list;
	}

	@Override
	public int empDelete(int empno) {
		
		Connection con = null;
		PreparedStatement ps = null;
		String sql1 = "delete from emp where empno = ?";		
		int result = 0;
		
		try {
			System.out.println("sql = "+sql1);
			con = DbUtil.getConnection();
			
			// 실행
			ps = con.prepareStatement(sql1);
			ps.setInt(1, empno);
			result = ps.executeUpdate();
			
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DbUtil.dbClose(ps, con);
			}
		
		return result;
	}

	@Override
	public int empUpdate(EmpVo vo) {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "update emp set ename=?, job=?, sal=?, hiredate=sysdate where empno=?";		
		int result = 0;
		
		try {
			System.out.println("sql = "+sql);
			// 연결
			con = DbUtil.getConnection();
			
			// 실행
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getEname());
			ps.setString(2, vo.getJob());
			ps.setInt(3, vo.getSal());
			ps.setInt(4, vo.getEmpno());

			result = ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DbUtil.dbClose(ps, con);
			}
		
		
		
		return result;
	}

	
}
