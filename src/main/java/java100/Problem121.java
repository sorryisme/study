package java100;

public class Problem121 {
    
}

class PrimeMath {
    
    public boolean isMod(int a , int b) {
        boolean isP = false;
        if( b != 0 && a % b==0) {
            isP = true;
            //나누어진다면 true 리턴
        }
        return isP;
    }
    
    
    public boolean isPri(int a) {
      boolean isP = true;
      //소수면 true;
      
      for(int i = 2; i<=Math.sqrt(a); i++) {
          if(isMod(a,i)) {
              isP=false;
              //나누어진다면 솟수가 아니다
              break;
          } else {
              isP=true;
              //그게 아니면 솟수
          }
      } 
      return isP;
    }
    
    public int divisors(int a) {
        int count = 1;
        for(int j = 2; j<=a; j++) {
            if(isMod(a,j)) {
                count ++;
            }
        }
        return count;
    }
    
    public int[] commonDivisors(int a) {
        int[]b = null;
        int count = 1;
        int num =1; 
        if(a > 1) {
            count = divisors(a);
            b = new int[count]; //약수 갯수만큼 배열선언
            b[0]=1;
            for(int j=2; j<=a; j++) {
                if(isMod(a,j)) {
                    b[num++] = j;//약수를 보관
                }
            }
            
        } else if(a==1){
            b=new int[1];
            b[0] =1;
        }
        
        return b;
    }
}