package kosta_java;

import java.util.Scanner;

public class Ex11 {
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();

        System.out.print("국어점수를 입력해주세요");
        int kor = sc.nextInt();

        System.out.print("영어점수를 입력해주세요");
        int eng= sc.nextInt();
        
        System.out.print("수학점수를 입력해주세요");
        int math= sc.nextInt();
        
        System.out.print("이름을 입력해주세요");
        String name = sc.next();
        // nextLine <=> next 차이 확인하기
        
        grade.print(name,kor,eng,math);


        
        
    }
}

class Grade{
    private int sum(int sub1, int sub2, int sub3){
        return sub1+sub2+sub3;
    }
    // 키보드 입력을 3개 받는다 sum 메소드를 호출

    private double aver(int sum,int count){
        return sum/(double)count;
    }
    // 개별적으로 계산한 뒤 print에서 일괄 출력

    private String grade(double avg){
        String result;
        switch((int)(avg/10)){
            case 10:
            case 9: result="A";break;
            case 8: result="B";break;
            case 7: result="C";break;
            case 6: result="D";break;
            default : result="F";
        }
        return result;
    }

    public void print(String name, int sub1, int sub2, int sub3){
        int sum = this.sum(sub1,sub2,sub3); 
        double aver = this.aver(sum,3);
        String grade = this.grade(aver);
        System.out.println(name +"님의 합계는 " + sum + " 평균은 " + aver + " 등급은 " + grade + "입니다");

    }

}
