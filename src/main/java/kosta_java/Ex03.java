package kosta_java;

import java.util.Scanner;

/* 
2. 연산기호따라 연산의결과를 출력한다.(연산기호 keyboard입력받는다)
    - 연산기호( +, - , * , / , % ) 
    - 임의의 두개의 난수를 정수형에 저장한다.(난수의 범위는 1 ~ 50사이)
    - 만약, + 라면  발생한 두개의 난수를 더한 결과를 출력한다. ex)   5 + 3 = 8  출력
    -라면 두개의 난수를 뺀다  ex)  5 - 3 = 2  출력
        만약 연산기호가  +, - , * , / , %  중의 하나가 아니라면  "연산기호 잘못되었습니다" 출력
 */

public class Ex03 {
    public static void main(String [] args){
        int nansu1 = (int)(Math.random()*50) + 1;
        int nansu2 = (int)(Math.random()*50) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("연산기호를 입력해주세요");
        String operation = sc.nextLine();
        
        if(operation.equals("+"))
            System.out.println(nansu1 + "+" + nansu2 + "=" + (nansu1 + nansu2));
        else if(operation.equals("-"))
            System.out.println(nansu1 + "-" + nansu2 + "=" + (nansu1 - nansu2));
        else if(operation.equals("*"))
            System.out.println(nansu1 + "*" + nansu2 + "=" + (nansu1 * nansu2));
        else if(operation.equals("/"))
            System.out.println(nansu1 + "/" + nansu2 + "=" + (nansu1 / (double)nansu2));
        else if(operation.equals("%"))
            System.out.println(nansu1 + "%" + nansu2 + "=" + (nansu1 % nansu2));
        else System.out.println("연산기호가 잘못되었습니다");
    }
}
