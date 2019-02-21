package java100;

public class Problem116_2 {
    public static void main(String[] args) {
        Lotto_2 lotto = new Lotto_2();
        lotto.makeLotto();
        for(int a : lotto.getBall()) {
            System.out.println(a);
        }
    }
}

class Lotto_2{
    private int[] ball;
    Lotto_2(){
        ball = new int [6];
        // 6개 담을 공간
    }
    public int[] getBall() {
        return ball;
    }
    
    public boolean isSame(int [] ball, int a) {
        boolean isS = false;
        for(int i = 0; i <ball.length; i++) {
            if(ball[i] == a) {
                isS = true;
                // 중복일 경우 true
                break;
            }
        }
        return isS;
    }
    public void makeLotto(){
        int count = 0;
        while(true) {
            int b = (int)(Math.random() * 45) +1; 
            if(! isSame(ball,b)) {
                ball[count] = b;
                count ++;
            }
            
            if(count == 6) {break;}
        }
        
    }
    
    
}
