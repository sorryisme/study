package java100;


/**
 * 10000873의 솟수여부 확인
 * 1과 n을 제외한 2~n-1까지 수로 나누어서 떨어지는 수가 있으면 솟수가 아님
 * */
public class Problem58 {
    public static void main(String[] args) {
        int toInt=10000873;
        boolean isP = true;
        for(int j = 2; j<toInt; j++) {
            if(toInt % j ==0) {
                isP = false;
                break;
             } else {
                 isP= true;
             }
            
        }
        
        if(isP) System.out.println(toInt+"는 소수입니다");
    }
    
    public static boolean isPrime(int num) {
        boolean isP = true;
        for(int j =2; j<num; j++) {
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


