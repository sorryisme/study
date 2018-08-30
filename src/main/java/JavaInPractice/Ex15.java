package JavaInPractice;

import java.util.Calendar;

//날짜 데이터의 비교
public class Ex15 {
    public static void main(String [] args) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2= Calendar.getInstance();
        cal1.set(Calendar.DAY_OF_MONTH, 1);//1일로 설정
        cal2.set(Calendar.DAY_OF_MONTH, 2);//2일로 설정
        
        System.out.println(cal1.getTime());
        System.out.println(cal2.getTime());
        //cal1과 cal2를 비교할 때 compareTo 메서드를 사용하자
        int result = cal1.compareTo(cal2);
        System.out.println(result);
        
        // 1일이 더 과거이기에 -1
        // 동일하면 0
        // 더 미래이면 1을 리턴
    }
}
