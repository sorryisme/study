package thisJava.ch12.ex05;

import java.awt.Toolkit;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(5000);
            } catch(InterruptedException e) {
                
            }
        }
    }
}
