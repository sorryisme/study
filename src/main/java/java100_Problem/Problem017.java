package java100_Problem;

public class Problem017 {
    public static void main(String[] args) {
        
        int year = 2004;
        if(year%2==0) {
            System.out.println(year+ "는 짝수해");
        } else {
            System.out.println(year+ "는 홀수해");
        }
        
        if(year%2!=1) {
            System.out.println(year+"는 짝수해");
        } else {
            System.out.println(year+"는 홀수해");
        }
        
        if((year % 4) == 0 && (year % 100) != 0 || (year % 400 == 0)){
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
        
        
        
    }
}
