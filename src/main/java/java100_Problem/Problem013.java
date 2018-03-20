// 1이면 남자 2이면 여자를 출력하자
// 상수의 개념
package java100_Problem;

public class Problem013 {
    public static void main(String[] args) {
        int myMoney = 800;
        int cups = 0;
        if(myMoney > 0) {
            cups =myMoney/200;
        } else if(myMoney == 0) {
            cups = 0;
        } else {
            cups = -1;
        }
    
    if(cups>0) {
        System.out.println("커피" + cups + "잔입니다.");
    } else {
        System.out.println("액수가 모자랍니다.");
    }

    }

}


