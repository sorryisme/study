package java100;

public class Problem125 {
    
    public static void main(String[] args) {
        int a = 64;
        int b = 18;
        System.out.println(gcd(a,b));
        System.out.println(commonMutiply(a,b));
        
    }
    public static int commonMutiply(int a, int b) {
        
        return (a * b )/gcd(a,b);
    }
    
    public static int gcd(int a , int b) {
        if(b ==0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
