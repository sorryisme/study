
package ThePrincipleOfJava.ch2_ch3;

public class Test07 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
        //1. 반올림하기 위해서 +0.5를 해준다
        System.out.println(shortPi);
    
        shortPi= Math.round(pi*1000) / 1000.0;
        //2. Math.round 메서드를 이용한다
        System.out.println(shortPi);

        }
}
