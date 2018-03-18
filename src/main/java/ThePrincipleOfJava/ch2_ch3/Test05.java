
package ThePrincipleOfJava.ch2_ch3;

public class Test05 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a*b);
        // 형변환을 하지 않으면 컴파일에러
        // 하지만 변환하더라도 byte의 크기가 작아 데이터 손실이 발생
        System.out.println(c);
    }
}
