package java100;


/**
 * 10000873의 솟수여부 확인
 * 1과 n을 제외한 2~n-1까지 수로 나누어서 떨어지는 수가 있으면 솟수가 아님
 * */
public class Problem59 {
    public static void main(String[] args) {
        int toInt=100;
        for(int i=1; i<toInt; i++) {
            if(isPrime(i)) {
                System.out.println(i+"소수입니다");
            } else {
                System.out.println(i+"소수가 아닙니다");
            }
            
        }
        
    }
    
    public static boolean isPrime(int num) {
        boolean isP = true;
        if( num < 2 ) {isP = false;}
        for(int j =2; j<=Math.sqrt(num); j++) {
            if(num % j == 0) {
                isP = false;
                break;
            } else {
                isP=true;
            }
        }
        return isP;
    }
    
}


