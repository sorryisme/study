package ThePrincipleOfJava.ch8;

public class Test04 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
        System.out.println(3);
        System.out.println(0/0);// 에러가 발생한 즉시 catch 문으로 이동한다
        System.out.println(4); // 출력되지 않음
        } catch (Exception e) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}

