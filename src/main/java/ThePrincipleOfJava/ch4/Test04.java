// 변형 예제
// 10의 자리 관련 처리를 하고싶다면 /10을하자

package ThePrincipleOfJava.ch4;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        System.out.println("당신의 점수를 입력하세요 (1~100)");
        
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.next();
        score = Integer.parseInt(tmp);//String을 int로 바꿈
        
        switch(score/10) {
        case 10:
        case 9 :
            grade = 'A';
            break;
        case 8:
            grade = 'B';
            break;
        case 7:
            grade = 'C';
            break;
        default : 
            grade = 'F';
       
        }
        
        System.out.println("당신의 학점은 "+ grade + "입니다.");
        
    }
}
