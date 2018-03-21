// 이름이 붙는 반목분 
// break 문 사용시 하나의 반복문 밖에 나가지 못한다
// 이를 해결하고자 이름을 붙여 점프할 수 있다.
package ThePrincipleOfJava.ch4;


public class Test08 {
    public static void main(String[] args) {
        Loop1 : for(int i=2; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                if(j==5)
                    break Loop1;
                continue Loop1;
                
            }
        }
        System.out.println("탈출");

    }
}
