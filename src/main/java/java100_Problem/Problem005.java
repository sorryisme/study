// 윤년을 계산하는 방법

package java100_Problem;

public class Problem005 {
    public static void main(String[] agrs) {

        for(int year=1998;year<2018;year++) {
            Boolean yearTF = false;
            if((year%4)==0 && year%100 != 0 || year % 400 ==0 ) {
                yearTF = true;
            }else {
                yearTF = false;
            }
            
            if(yearTF) {
                System.out.println("윤년입니다.");
            } else {
                System.out.println("윤년이 아닙니다");
            }
            
        } //for

        
    }//main
}
