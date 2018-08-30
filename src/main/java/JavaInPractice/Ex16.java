package JavaInPractice;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 *  종류     /  연월일            / 시간                / 일시                         / 
 * local / LocalDate / LocalTime  / LocalDateTime /
 * zoned                          / ZonedDateTime /
 * Offset/          /OffsetTime / OffsetDateTime /
 * 시차를 다루지 않으면 Local
 * 시차를 다루면 Offset
 * 그 지역의 일시가 고려된 상황이면 ZonedDateTime
 */

public class Ex16 {
    public static void main(String[] args) {
        
        // 시차를 가미하지 않는 날짜와 시간 생성
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        
        // 시차를 가미한 날짜와 시간 생성
        OffsetDateTime offsetDateTime = 
                OffsetDateTime.of(2020, Month.APRIL.getValue(),8,10,20,30,0,ZoneOffset.of("+09:00"));
        System.out.println(offsetDateTime);
        
        //시차와 지역 정보를 가미한 날짜와 시간 생성
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2025-07-24T11:12+09:00[Asia/Seoul]");
        System.out.println(zonedDateTime);
    }
}
