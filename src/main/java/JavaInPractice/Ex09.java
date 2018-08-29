package JavaInPractice;
//Ex08 상속
public class Ex09 extends Ex08{
    Ex09(){
        super();
        // 부모 생성자는 처음에 호출 
        // 작성하지 않으면 자동으로 호출
        System.out.println("자식 클래스의 생성자입니다.");
    }
}
