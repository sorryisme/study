package JavaInPractice;

import java.io.Serializable;
import java.math.BigDecimal;

/*
 * instanceof 연산자는 비교 대상 데이터가 다음과 같은 조건을 만족하면 true 반환
 * 지정한 클래스 / 지정한 클래스를 상속한 클래스 / 지정한 인터페이스를 구현한 클래스
 * */
public class Ex02 {
    public static void main(String[] args) {
        String value = "가나다라마";
        boolean result = value instanceof String;
        System.out.println("가나다라마 = "+result);
        
        // 상속한 클래스와 자료형 비교
        result = value instanceof Object;
        System.out.println("가나다라마= " + result);
        
        // 인터페이스와 자료형 비교
        result = value instanceof Serializable;
        System.out.println("가나다라마= " + result);
        
        //일치하지 않는 자료형
        Object object = "가나다라마";
        result = object instanceof BigDecimal;
        System.out.println("가나다라마 = "+ result);
    }
}
