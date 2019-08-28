package JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest2 {
    
    private StringCalculator2 strCal;
//  private Calculator cal = new Calculator();
//  테스트가 독립적으로 실행을 보장하기 위해서 setUp으로 매번 새롭게 생성
//  Junit은 테스트가 진행될 때 새롭게 클래스를 생성 하지만 static 방식은 클래스로더에 시작시에 업로드 되기때문에..
    
    @Before
    public void setUp() {
        strCal = new StringCalculator2();
        System.out.println("setUp");
    }
    
    @Test(expected=ArithmeticException.class)
    public void add() {
        
        assertEquals(5, strCal.add("2,3"));
        assertEquals(5, strCal.add("2:3"));
        assertEquals(0, strCal.add(""));
        assertEquals(14, strCal.add("6,5:3"));
        assertEquals(6, strCal.add("//;\n1;2;3"));
        assertEquals(-1, strCal.add("-13"));
    }

    @After
    public void tearDown() {
        System.out.println("shutDown");
    }
}
