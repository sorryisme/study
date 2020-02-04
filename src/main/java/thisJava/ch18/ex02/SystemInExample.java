package thisJava.ch18.ex02;

import java.io.InputStream;

public class SystemInExample {
    public static void main(String[] args) {
        try {
            InputStream is = System.in;
            int asciiCode = is.read();
            char inputChar = (char)asciiCode;
            System.out.println("ascii code " + asciiCode);
            System.out.println("inputChar " + inputChar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
