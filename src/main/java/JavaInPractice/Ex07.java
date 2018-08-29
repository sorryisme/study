package JavaInPractice;

public class Ex07 {
    public static void main(String [] args) {
        Ex05 emp = new Ex05();
        Ex06 part = new Ex06();
        
        emp.setPosition("일반사원");
        part.setPosition("아르바이트");
        
        emp.work();
        part.work();
        
    }
}
