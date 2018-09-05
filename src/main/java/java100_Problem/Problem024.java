package java100_Problem;

public class Problem024 {
    public static void main(String[] args) {
        int intNm1 = 123;
        long longNum1 = 345L;
        double doubleNum = 123.123;
        
        Integer intWrap1 = new Integer(187);
        Long longWrap1 = new Long(876);
        Double doubleWrap1 = new Double(365);
        
        Object obj = new Object();

        Integer intWrap2 = intNm1; // 박싱
        intNm1 = intWrap2; // 언박싱 intNm1 =(int)int Wrap2;
        
        obj=longWrap1; // 상속관계 프로모션
        longWrap1 = (Long)obj; //상속관계 캐스팅
        obj=intNm1;//박싱 
        intNm1 = (Integer)obj; // 언박싱
        System.out.println(intNm1);
        
        
        
        

        
    }
}
