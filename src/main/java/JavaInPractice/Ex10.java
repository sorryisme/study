package JavaInPractice;

public class Ex10 {
    public static void main(String [] args) {
        String text1 = "정말";
        String text2 = "감사합니다";
        StringBuilder sb = new StringBuilder();
        sb.append(text1);
        sb.append(text2);
        String resultString = sb.toString();
        System.out.println(resultString);
        // StringBuilder 클래스는 append 메서드로 문자열을 축적
        // toString 메서드로 모아둔 문자열 출력
        
    }
}
