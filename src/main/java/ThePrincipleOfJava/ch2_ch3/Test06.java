
package ThePrincipleOfJava.ch2_ch3;

public class Test06 {
    public static void main(String[] args) {
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';
        
        System.out.printf("'%c' - '%c' = %d\n", d,a,d-a);
        System.out.printf("'%c' - '%c' = %d\n", two,zero,two - zero);
        System.out.printf("'%c' = %d\n", a, (int)a);
        System.out.printf("'%c' = %d\n", d, (int)d);
        System.out.printf("'%c' = %d\n", two, (int)two);
        System.out.printf("'%c' = %d\n", zero, (int)zero);
        // 문자는 실제로 해당문자의 유니코드 
        // 문자 : 0 , 유니코드 48
        // 문자 : A , 유니코드 65
        // 문자 : a , 유니코드 97
     
    
    
    }
}
