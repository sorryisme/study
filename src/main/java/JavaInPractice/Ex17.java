package JavaInPractice;

public class Ex17 {
    public static void main(String[] args) {
        String[] name = new String[3];
        
        name[0] = "철수";
        name[1] = "영희";
        name[2] = "길동";
        
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        
        // 배열에 저장된 모든 값 꺼내기
        for(String value : name ) {
            System.out.println(value);
        }
    }
}
