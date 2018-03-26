package ThePrincipleOfJava.ch8;

public class Test05 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if( ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception"); // 첫번째 catch 문에서 걸렸기 때문에 2번째는 패스
        }
        System.out.println(6);
    }
}
