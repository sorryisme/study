/*
 * 문제 : 세종 여행사에서 아래 표와 같이 유럽 3개국 여행상품을 판매하고 있다.
 * 국가번호 / 국가명 / 여행상품가격(원/1인)
 * 1 / Spain / 820,000
 * 2 / France /850,000
 * 3 / Italy / 770,000
 * 고객이 국가번호 및 여행 인원수를 입력하면 고객이 지불해야할 총 금액을 출력하는 프로그램을 작성하시오
 *   - 여행 인원수는 반드시 1명이다
 *   - 국가 번호 입력 시 예외사항은 고려하지 않는다
 * */


package SJ_SWtest;

import java.util.Scanner;

public class test01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("*** Country Code ***");
        System.out.println("1. Spain");
        System.out.println("2. Fracne");
        System.out.println("3. Italy");
        
        System.out.printf("Select Code =");
        int countryCode = sc.nextInt();
        
        System.out.printf("Input the number of people = ");
        int count = sc.nextInt();
        System.out.println("*** Total Price ***");
        
        int price;
        switch(countryCode) {
        case 1 : price = 820000;
            break;
        case 2: price = 850000;
            break;
        case 3: price = 770000;
            break;
         default :price =0;
        }
        
        System.out.println(count * price);
    }
    
    
    
}
