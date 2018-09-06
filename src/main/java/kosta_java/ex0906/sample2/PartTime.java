package kosta_java.ex0906.sample2;

public class PartTime extends Employee {
private int timePay;
    
    PartTime(){}
    PartTime(int empNo,String eName,String job, int mgr,String hiredate, String deptName, int timePay){
        super(empNo,eName,job,mgr,hiredate,deptName);
        
        this.timePay = timePay;
    }

    public int getTimePay(){
        return timePay;
    }

    public void setTimePay(int TimePay){
        this.timePay= timePay;
    }   


    //오버라이딩
    public void message(){
        System.out.println(this.geteName() + "는 비정규직입니다");
    }
    //오버라이딩
    public String toString(){
        return this.getEmpNo() + " | " + this.getEmpNo() + " | " + this.getJob() + " | " + this.getMgr() + " | " + this.getHiredate() + " | " + this.getDeptName() + " | " + this.timePay;
    }

}




