// 가위바위보를 구현
// 결과를 간략화 시켜서 문제를 해결하자! 
package ThePrincipleOfJava.ch4;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력해주세요");
        
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int)(Math.random()*3) +1;// 0 ~ 0.9 * 3 + 1 => 1~3
        System.out.println("당신은 " + user + "입니다");
        System.out.println("컴은" + com + "입니다.");
        
        switch(user-com) {
        case 2: case -1:
            System.out.println("당신이 졌습니다");
            break;
        case 1: case -2:
            System.out.println("당신이 이겼습니다");
            break;
            
        case 0:
            System.out.println("비겼습니다");
            break;
            
        }
        
    
    }
}
