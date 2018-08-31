package kosta_java;

import java.rmi.server.Operation;
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
        //methodOper(a,b,c);
        //this.methodOper(a,b,c);
        //차이 공부하기
    }
    
     public static void methodOper(int i, int j, String str){
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
