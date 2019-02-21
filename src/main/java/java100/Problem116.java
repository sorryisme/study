package java100;

public class Problem116 {
    public static void main(String[] args) {
        Lotto lotto = new Lotto(); // 생성자를 통한 배열생성
        lotto.make();//로또 생성
        for(int a : lotto.getBall()) {
            System.out.println(a);
        }
        
        
    }
}

class Lotto{
    private int ball[];
    
    Lotto(){
        ball = new int[6];
    }
    
    public int[] getBall() {
        return ball;
    }
    
    private boolean isSame(int[] a, int b) {
        boolean isP = false;
        for (int i = 0; i<a.length;i++) {
            if(a[i] == b) {
                isP = true;
                break;
            }
        }
        return isP;
    }

    public void make() {
        System.out.println("실행");
        int count = 0;
        while(true) {
            int b=(int)(Math.random()*45)+1;
            if(!isSame(ball,b)) {
                ball[count++] = b;
            }
            
            if(count == 6) {
                break;
            }
        }
    }
    
}