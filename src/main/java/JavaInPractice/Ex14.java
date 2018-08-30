package JavaInPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//날짜 데이터를 지정서식으로 출력한다
public class Ex14 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH,1);
        Date nextMonth = cal.getTime();
        System.out.println(nextMonth);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String formatedStr = sdf.format(nextMonth);
        System.out.println(formatedStr);
    }
}
