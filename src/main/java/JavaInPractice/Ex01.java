package JavaInPractice;

public class Ex01 {
    public static void main(String[] args) {
        boolean result = "가나다라마" == "가나다라마";
        System.out.println("가나다라마 == 가나다라마= " + result);
        
        result = new String("가나다라마") == new String("가나다라마");
        System.out.println("가나다라마 == 가나다라마= " + result);
    }
    
}
