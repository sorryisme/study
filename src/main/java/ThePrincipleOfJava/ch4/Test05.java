// 반복문
// 참고 사항 :
// 조건식 : ~ 하는 동안 (조건문이 참일 동안에)
// 증감식 i+=2(2씩 증가), i*=3 (3배씩 증가)



package ThePrincipleOfJava.ch4;


public class Test05 {
    public static void main(String[] args) {
        System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
        System.out.println("------------------------------------------------------");
        
        for (int i=1; i<=10; i ++) {
            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d \n", i, 2*i, 2*i-1 , i*i , 11-i , i%3 , i/3 );
            // i , 짝수 , 홀수, n승, 역순, 순환 , 반복  
        }
    
    }
}
