package ThePrincipleOfJava.ch15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx3 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("test.text");
            ps = new PrintStream(fos);
            System.setOut(ps); 
            // 출력 대상을 test.txt로 지정
        } catch (FileNotFoundException e) {
            System.err.println("file not found");
        }
        
        System.out.println("Hello by System.out");
        System.err.println("Hello by System.err");
    }
}
