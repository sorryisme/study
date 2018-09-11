package kosta_java.exception;

public class ExceptionExam {
    public static void main(String[] args) {
        System.out.println("메인 시작하기");
        
        
        try {

            String data = args[0]; // Array index out of BoundsException 가능성 코드
            System.out.println("data = " + data);
            
            int convertNo = Integer.parseInt(data);//numberFormatException 
            System.out.println(convertNo);
            
            int result = 100 / convertNo;
            System.out.println("나눈 결과 : "+result);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외발생 : " + e);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("숫자만 입력하세요 : " + e.getMessage());
        } catch (Exception e) { // 다형성이 적용됨
            e.printStackTrace();//오류에 대한 정보를 가장 detail 하게 출력
        } finally {
            System.out.println("난 예외발생 여부 상관없이 항상 실행됩니다.!!!!");
        }
        System.out.println("메인 끝");
    }
}