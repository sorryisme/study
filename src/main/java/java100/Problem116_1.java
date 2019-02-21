package java100;

public class Problem116_1 {
    public static void main(String[] args) {
        Lotto_1 lotto = new Lotto_1();
        lotto.makeLotto();
        for(int a : lotto.getBall()) {
            System.out.println(a);
        }
    }
}

class Lotto_1{
    private int[] ball;
    Lotto_1(){
        ball = new int [6];
        // 6개 담을 공간
    }
    public int[] getBall() {
        return ball;
    }
    
    public void makeLotto(){
        for(int i = 0; i < 6; i++ ) {
            boolean isSame = false;
            int b = (int)(Math.random() * 45 )+1;
            //로또 갯수
            for(int j =0; j < ball.length; j++) {
                //중복여부 확인
                if(ball[j] == b) {
                    isSame = true;
                    System.out.println(ball[j]+":"+b);
                    break;
                }
            }
            
            if(!isSame) {
                ball[i] = b;
                continue;
            } else {
                i--;
                // 만약 같다면 i--
            }
            
        }
        
    }
    
    
}

