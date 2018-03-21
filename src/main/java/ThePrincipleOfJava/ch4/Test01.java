package ThePrincipleOfJava.ch4;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';
        System.out.println("점수를 입력해주세요 ");
        
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        
        System.out.printf("담신의 점수는 %d 입니다", score);
        
        if(score >= 90) { // score가 90점 보다 같거나 크다면 A학점
            grade = 'A';
            if (score >= 98) { // 90점 이상에서 98점 이상이면 +
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        }  else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84){
                opt = '-';
            }
        } else {
            grade ='c';
        }
        System.out.printf("당신의 학점은 %c%c 입니다\n", grade, opt);
    }
}
