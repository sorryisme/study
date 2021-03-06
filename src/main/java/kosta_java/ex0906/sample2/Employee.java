package kosta_java.ex0906.sample2;

public class Employee {
    private int empNo;
    private String eName;
    private String job;
    private int mgr;
    private String hiredate;
    private String deptName;
    
    Employee(){}
    Employee(int empNo,String eName,String job, int mgr, String hiredate, String deptName){
        this.empNo = empNo;
        this.eName = eName;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.deptName = deptName;
    }
        

    public int getEmpNo(){
        return empNo;
    }

    public void setEmpNo(int empNo){
        this.empNo = empNo;
    }

    public String geteName(){
        return eName;
    }

    public void seteName(String eName){
        this.eName = eName;
    }

    public String getJob(){
        return job;
    }

    public void setJob(String job){
        this.job = job;
    }

    public int getMgr(){
        return mgr;
    }

    public void setMgr(int mgr){
        this.mgr = mgr;
    }

    public String getHiredate(){
        return hiredate;
    }

    public void setHiredate(String hiredate){
        this.hiredate = hiredate;
    }

    public String getDeptName(){
        return deptName;
    }
    
    public void setDeptName(String deptName){
        this.deptName = deptName;
    }
    

    public void message(){
        System.out.println(eName + "는 정규직입니다");
    }
    
    public String toString(){
        return empNo + " | " + eName + " | " + job + " | " + mgr + " | " + hiredate + " | " + deptName;
    }
    
}
