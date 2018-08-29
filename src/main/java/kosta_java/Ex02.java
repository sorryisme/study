package kosta_java;
/*
1. 성적표기능을 만들 클래스를 선언하고 메인메소드 작성한다.
2. 메인메소드안에서 하는 일
    - 본인 이름(String)을 저장할 변수를 선언한다.
    - 국어(int),영어(int),수학(int) 점수(를 저장할 변수를 선언한다.
    - 총점(int), 평균(double), 학점(char)을 저장할 변수를 선언한다.

    - 선언된 국어, 영어, 수학 변수에 45 ~ 100사이의 난수를 발생하여 저장한다)
    - 국어, 영어, 수학점수을 총점을 구하여 총점 변수에 저장한다.
    - 총점을 가지고 평균을 구하여 평균 변수에 저장한다.

    - 평균이 90이상이면 학점을 A  
             80~89사이 이면 B
             70~79사이 이면 C
             60~69사이 이면 D
             60미만 이면 F

        * if문 , switch문 두가지 방법 모두 사용한다.

    - 평균을 출력할대 소수점 2자리까지만 출력한다(함수사용안됨)             

    - 이름 , 국어점수, 영어점수, 수학점수, 총점,평균, 학점을 예쁘게 출력해본다.

*/


public class Ex02 {
    public static void main(String [] args){
        String name = "김지성";
        int kor = (int)(Math.random() * 56 + 45);
        int eng = (int)(Math.random() * 56 + 45);
        int math = (int)(Math.random() * 56 + 45);
        int sum = kor + eng + math;
        double avg = sum / 3.0;
        double avgConvert = (int)(avg * 100) / 100.0;
        char grade='F';
        
        if(avg >= 90){
            grade = 'A';
        } else if(avg >= 80){
            grade = 'B';
        } else if(avg >= 70){
            grade = 'C';
        } else if(avg >= 60){
            grade = 'D';    
        } 
        
        System.out.println("국어점수:" + kor + "\t영어점수:" + eng 
            + "\t수학점수:" + math + "\t합계:" + sum + "\t평균: " + avgConvert + "\t등급: " + grade);
        
        // switch 등급
        switch((int)(avg/10)){
            case 9: grade='A';break;
            case 8: grade='B';break;
            case 7: grade='C';break;
            case 6: grade='D';break;
            default: grade='F';
        }

        System.out.println("switch문의 등급은" + grade + "입니다.");

    }
}
