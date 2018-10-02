package kosta_java.ex1002.dto;

public class EmpVo {
	private int empno;
	private String ename;
	private String job;
	private int sal;
	private String hiredate;

	public EmpVo() {}
	public EmpVo(int empno, String ename, String job, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	public EmpVo(int empno, String ename, String job, int sal, String hiredate) {
		this(empno,ename,job,sal);
		this.hiredate = hiredate;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	@Override
	public String toString() {
		return "EmpVo [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", hiredate=" + hiredate
				+ "]";
	}

	
	
	
}
