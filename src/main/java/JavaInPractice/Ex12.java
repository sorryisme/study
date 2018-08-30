package JavaInPractice;

import java.util.Calendar;
import java.util.Date;

//날짜를 변경하는 방법
// 임의의 날짜를 생성 Calendar 클래스 사용 
public class Ex12 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,1);
        // Calendar 클래스에서 Date 클래스를 얻는다
        //cal.set(Calendar.DAY_OF_MONTH,1);
        // add의 경우 더하기 , set의 경우 인수 값으로 초기화 (1일로 초기화)
        Date nextMonth = cal.getTime();
        System.out.println(nextMonth);
        
        
    }
}
