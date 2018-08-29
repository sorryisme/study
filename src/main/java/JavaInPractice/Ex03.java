package JavaInPractice;
public class Ex03 {
    public static void main(String[] args) {
       String stringValue = "가나다라마";
       for(int i = 0; i < stringValue.length(); i++) {
           System.out.println(stringValue.charAt(i));
           }
           System.out.println("------------------------배열을 이용한 예제");
           
           char[] chars = stringValue.toCharArray();
           for (char charValue : chars) {
               System.out.println(charValue);
           }
           
      
    }
}


