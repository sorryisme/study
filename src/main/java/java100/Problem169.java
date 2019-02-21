package java100;

public class Problem169 {

}

class CompThink{
    private int[] ball;
    private int num1;
    private int num2;
    public CompThink(int num1 , int num2) {
        this.num1 = num1;
        this.num2 = num2;
        ball = new int[num2];
        
    }
    
    public int[] getBall() {
        return ball;
    }
    
    private boolean isSame(int a[] , int  b) {
        boolean isS= false;
        for(int i=0; i < a.length; i++) {
            if(a[i] == b) {
                isS= true;
                break;
            }
        }
        return isS;
    }
    
    private void make() {
        int count = 0; 
        while(true) {
            int b = (int)(Math.random() * num1);
            if(! isSame(ball,b)) {
                ball[count++] =b;
            }
            if(count == num2) { break;}
        }
    }
    
}