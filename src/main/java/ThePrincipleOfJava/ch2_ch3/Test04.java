// 전위형, 후위형 차이

// 다른 수식에 포함되거나 메서드의 매개 변수로 사용 될 경우 전위형/후위형 결과는 다름
package ThePrincipleOfJava.ch2_ch3;

public class Test04 {
    public static void main(String[] args) {
        int i=5, j=0;
        j=i++;
        System.out.println("j=i++; 실행후 i=" + i +", j=" + j);
        // postfix 변수값을 먼저 놓고 변수를 증가시킴
        i=5;
        j=0;
        j = ++i;
        System.out.println("j=i++; 실행후 i=" + i +", j=" + j);
        // prefix 변수값을 1증가시키고 그자리에 변수값

    }
}
