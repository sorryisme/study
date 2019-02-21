package java100;

public class Problem127 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    
    public static int factorial(int a) {
        
        if(a == 1) {
            return 1;
        }
        
        return factorial(a-1) * a;
    }
}
