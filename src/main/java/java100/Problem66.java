package java100;

public class Problem66 {
    public static void main(String[] args) {
        System.out.println(divisorSum(5));
        printDivisor(10);
    }
    
    public static int divisorSum(int a) {
        int sum = 1;
        for(int j=2; j <= a; j++) {
            if( a % j ==0) {
                sum += j;
            }
        }
        return sum;
    }
    
    public static void printDivisor(int a) {
        for(int j=1; j<=a ; j++) {
            if( a% j ==0) {
                
                System.out.println(j);
            }
        }
    }
    
}
