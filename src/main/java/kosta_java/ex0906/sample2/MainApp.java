package kosta_java.ex0906.sample2;

public class MainApp {
    public static void main(String[] args) {
        
        Employee [] employee = new Employee[5];

        
        employee[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
        employee[1]= new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
        employee[2]= new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
        employee[3] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
        employee[4] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);
        
        for (int i = 0; i < employee.length ; i++){
            System.out.println(employee[i].toString());
        }

        for (int i = 0; i < employee.length ; i++){
            employee[i].message();
            //오버라이딩 된 메서드가 호출된다... 
        }
        
        
        
    }

}






