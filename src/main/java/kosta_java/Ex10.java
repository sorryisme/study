package kosta_java;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요");
        int a = sc.nextInt();

        System.out.print("두번째 숫자를 입력하세요");
        int b = sc.nextInt();

        System.out.print("연산자를 입력하세요");
        String c = sc.next();

        Ex10.methodOper(a,b,c);
        //methodOper(a,b,c); => static static끼리 호출이 가능
        //this.methodOper(a,b,c);
        //차이 공부하기
        //static 없다면 
        //Operation op = new Operation();
        //op.methodOper(a,b,c);
    }

    public static void methodOper(int i, int j, String str){
        // 만약 static이 없다면 객체를 생성해서 처리
        switch(str){
        case "+": System.out.println(i + "+" + j + "=" + (i+j));break;
        case "-": System.out.println(i + "-" + j + "=" + (i-j));break;
        case "/": System.out.println(i + "/" + j + "=" + (i/j));break;
        case "*": System.out.println(i + "*" + j + "=" + (i*j));break;
        case "%": System.out.println(i + "%" + j + "=" + (i%j));break;
        default: System.out.println("잘못되었습니다");
        }
    }


}
