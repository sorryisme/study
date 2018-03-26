package ThePrincipleOfJava.ch8;

public class Test03 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4);
        } catch (Exception e) {
            System.out.println(5); // 실행 되지 않는다,
        }
        System.out.println(6);
    }

}
