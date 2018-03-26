package ThePrincipleOfJava.ch8;

public class Test08 {
    public static void main(String[] args) throws Exception{
        method();
        System.out.println("완료");
    }

    static void method() {
        try{
            method2();
        } catch (Exception e) {
            System.out.println("예외처리");
            e.printStackTrace();
        }
    }
    
    static void method2() throws Exception {
        throw new Exception();
    }
}