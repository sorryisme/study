package kosta_java;
import java.util.Scanner;

public class Ex06 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int sum = 0;
        //label:
        do{
            System.out.println("선택 >> 1.증가 2.감소 3.종료");
            input = sc.nextInt(); 
            /*switch (input){
                case 1: System.out.println("증가결과"+ (++sum)); break;
                case 2: System.out.println("감소결과"+ (--sum)); break;
                case 3: System.out.println("종료"); break label;
            }*/
            
            if(input == 1) {sum++;System.out.println("증감값"+sum);}
            if(input == 2) {sum--;System.out.println("증감값"+sum);}


        }while (input != 3);
    }
}
