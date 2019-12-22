package JavaInPractice.MultiThread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UnsafeSample {
    public static void main(String[] args) {
        //SimpleDateFormat not thread safe
        DateFormat unsafeDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        
        Calendar cal1 = Calendar.getInstance();
        cal1.set(1989,  Calendar.MARCH, 10);
        
        Date date1 = cal1.getTime();
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2020, Calendar.JANUARY, 20);

        Date date2 = cal2.getTime();
        
        Thread thread1 = new Thread(()-> {
            for (int i = 0 ; i < 100; i++) {
                try {
                    String result = unsafeDateFormat.format(date1);
                    System.out.println("Thread1 : " + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
        });
        
        
        Thread thread2 = new Thread(()-> {
            for (int i = 0 ; i < 100; i++) {
                try {
                    String result = unsafeDateFormat.format(date2);
                    System.out.println("Thread2 : " + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
        });
        
        System.out.println("스레드 확인");
        thread1.start();
        thread2.start();
    }
}
