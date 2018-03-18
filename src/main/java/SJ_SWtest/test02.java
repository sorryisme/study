/*
 * 문제 : 세종 여행사에서 아래 표와 같이 유럽 3개국 여행상품을 판매하고 있다.
 * 국가번호 / 국가명 / 여행상품가격(원/1인)
 * 1 / Spain / 820,000
 * 2 / France /850,000
 * 3 / Italy / 770,000
 * 4. / England / 800,000
 * 5. / Greece / 730,000
 * - 국가번호 0을 입력하면 구매 종료 기능
 * */


package SJ_SWtest;

import java.util.Scanner;

public class test02 {

    static Scanner sc = new Scanner(System.in);
    static int price = 0;
    static int productCnt =0;
    public static void main(String[] args) {
        
       while(true) {
        int code = prompt();
        calcuPrice(code);
       }
    }
    
    public static int prompt() {
        System.out.println("*** Country Code ***");
        System.out.println("0. Exit");
        System.out.println("1. Spain");
        System.out.println("2. Fracne");
        System.out.println("3. Italy");
        System.out.println("4. England");
        System.out.println("5. Greece");
        System.out.printf("Select Code =");
        int countryCode = sc.nextInt();
        return countryCode;
    }
    
    public static void calcuPrice(int code) {
        switch(code) {
        case 0 :System.out.println("Total price " + price);
                System.out.println("The Total number of goods = " + productCnt);
                System.exit(0);
        case 1 : price += 820000;
                productCnt++;
            break;
        case 2: price += 850000;
                productCnt++;
            break;
        case 3: price += 770000;
                productCnt++;   
            break;
        case 4 : price += 800000;
                productCnt++;
            break;
        case 5 : price += 730000;
                productCnt++;
            break;
         default :price +=0;
        }
    }
    
}
