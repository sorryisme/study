// 1이면 남자 2이면 여자를 출력하자
// 상수의 개념
package java100_Problem;

public class Problem013_2 {
    public static void main(String[] args) {
        int myMoneyA = 800;
        int cupsA = Problem013_2.coffee(myMoneyA);
        Problem013_2.printCoffee(cupsA);
        
        int myMoneyB = 150;
        int cupsB = coffee(myMoneyB);
        printCoffee(cupsB);
    }
    
    public static int coffee(int money) {
        int cups = 0;
        if(money > 0) {
            cups =money/200;
        } else if(money ==0) {
            cups =0;
        } else {
            cups = -1;
        }
        return cups;
    }
    
    public static void printCoffee(int cups) {
        if(cups>0) {
            System.out.println("커피" + cups + "잔입니다");
        } else {
            System.out.println("액수가 모자랍니다.");
        }
    }
    // CBV와 CBR의 차이 공부할 것!
}


