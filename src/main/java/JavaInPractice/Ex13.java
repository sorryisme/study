package JavaInPractice;

import java.util.Calendar;
import java.util.Date;

//날짜를 변경하는 방법
// 임의의 날짜를 생성 Calendar 클래스 사용 
public class Ex13 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,1);
        Date nextMonth = cal.getTime();
        System.out.println(nextMonth);
        // 월 부분만 꺼낸다
        
        int month = cal.get(Calendar.MONTH);
        System.out.println(month);
        // 월부분을 출력하면 월에서 1을 뺀 값을 가져옴
        
    }
}
