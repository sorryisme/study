/* 입력 다음날 출력
 *  하루 뒤를 출력
*/
package java100_Problem;

import java.util.Calendar;
import java.util.Date;

public class Problem006 {
        public Date afterOneDay(Date d) {
            long dd = d.getTime();
            //밀리세컨드 ( 1000 * 60초 = 1분)
            return new Date(dd+1000*60*60*24);
        }

        public Date beforeOneDay(Date d) {
            long dd = d.getTime();
            //밀리세컨드 ( 1000 * 60초 = 1분)
            return new Date(dd-1000*60*60*24);
        }

        public Date setDate(int year,int month,int day) {
                Calendar cal = Calendar.getInstance();
                cal.set(year,month-1,day);
                return new Date(cal.getTimeInMillis());
        }
        
        public static void main(String[] args) {
            Problem006 date = new Problem006();
            
            System.out.println(date.setDate(2018,03,17));
            // 출력값 : Sat Mar 17 01:00:46 KST 2018 (util.date
            System.out.println(date.afterOneDay(date.setDate(2018,03,17)));
            // +1 일
            System.out.println(date.beforeOneDay(date.setDate(2018,03,17)));
            // -1 일
            
        }
        
        
}


