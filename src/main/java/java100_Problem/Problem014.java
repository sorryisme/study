// 1이면 남자 2이면 여자를 출력하자
// 상수의 개념
package java100_Problem;

public class Problem014 {
    public static void main(String[] args) {
        int myMoney = 500;
        int cups = coffee(myMoney, 300);
        printCoffee(cups);
        
        int noChange = 400;
        coffeeIn(noChange);
        System.out.print("main");
        System.out.println("noChangesms " + noChange + "다");
        
        String sChange = "hyonny";
        coffeeIn(sChange);
        System.out.print("main");
        System.out.println("sChange는 " + sChange +"다.");
    
    }

    
    
    
    public static void coffeeIn(int money) {
        money += 300;
        money /= 50;
        System.out.println("method coffeeIn");
        System.out.println("money는 "+ money +"원이다.");
    }

    public static void coffeeIn(String money) {
        money = money.replace('o', 'z');
        money += "안녕";
        System.out.println("method coffeeIn");
        System.out.println("money는 " + money + "다.");
    }
    
    public static int coffee(int money,int coffeeValue) {
        if(coffeeValue <= 100) {
            return -1;
        }
        int cups =-1; // 초기화 문제가 있으면 -1 리턴
        if(money > 0) {
            cups = money/coffeeValue;
        }
        return cups;
    } 

    public static int coffee(int money) {
        return coffee(money,200);
    } // coffee

    public static void printCoffee(int cups) {
        if(cups>0) {
            System.out.println("커피" + cups + "잔입니다");
        } else {
            System.out.println("액수가 모자랍니다.");
        }
    } //print coffee
}


