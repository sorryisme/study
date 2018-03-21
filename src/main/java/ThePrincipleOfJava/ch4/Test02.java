/* switch의 경우 피라미드형태로 권한을 주는 회원가입 형태의 경우 break를 사용하지 않으면 된다
 * 또한 여러개 주고 싶다면 다음과 같이 3~4개 중복해서 작성해도 된다
 * 
 */



package ThePrincipleOfJava.ch4;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.print("현재 월일을 입력해주세요>");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        
        switch(month) {
            case 3:
            case 4: 
            case 5: 
                System.out.println("현재 계절은 봄입니다");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재 계절은 여름입니다");
            case 9:
            case 10:
            case 11:
                System.out.println("현재 계절은 가을입니다");
            default: 
            case 12: case 1: case 2:
                System.out.println("현재 계절은 겨울입니다");
            
        }
    
    
    }
}
