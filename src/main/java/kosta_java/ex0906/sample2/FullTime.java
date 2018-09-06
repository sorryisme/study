package kosta_java.ex0906.sample2;

public class FullTime extends Employee{
    private int salary;
    private int bonus;
    
    FullTime(){}
    FullTime(int empNo,String eName,String job, int mgr, String hiredate,String deptName, int salary, int bonus){
        super(empNo,eName,job,mgr,hiredate,deptName);
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalray(int salary){
        this.salary = salary;
    }   

    public int getBonus(){
        return bonus;
    }

    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    //오버라이딩
    public void message(){
        System.out.println(this.geteName() + "는 정규직입니다");
    }
    //오버라이딩
    public String toString(){
        return this.getEmpNo() + " | " + this.getEmpNo() + " | " + this.getJob() + " | " + this.getMgr() + " | " + this.getHiredate() + " | " + this.getDeptName() + " | " + this.getSalary() + " | " +  this.bonus;    
    }

}

