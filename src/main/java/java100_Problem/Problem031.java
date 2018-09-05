package java100_Problem;

/**
 * 
 * 
 * a의 int값은 97 10진수 유니코드는 /0041
 *
 */

public class Problem031 {
    public static void main(String[] args) {
        for(int i=21;i<=60;i++){
            System.out.print("["+(char)i+"]");
            if(i%10==0) {
                System.out.println();
            }
        }
        
        System.out.println('a');
        System.out.println('A');
        System.out.println("알파벳 : "+('z'-'a'+1)+"자");

        char cc='한';
        
        System.out.println(cc);
        System.out.println((int)cc);
        
        char zChar = '0';
        int count =(int)zChar;
        System.out.println(count);
        for(int i=count;i<=count+9;i++) {
            System.out.print("[" + (char)i +"]");
        }
        
        System.out.println();
        
        System.out.println('\u0001');
        System.out.println('\1');
    }
}
