package thisJava.ch18.ex06;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception{
        long start = 0;
        long end = 0;
        
        FileInputStream fis1 = new FileInputStream("C:/Temp/testfolder/test.PNG");
        start = System.currentTimeMillis();
        while(fis1.read() != -1 ) {}
        end = System.currentTimeMillis();
        
        System.out.println("fis1 " + (end - start) + "ms" );
        fis1.close();
        System.out.println("---------------------------");
        
        FileInputStream fis2 = new FileInputStream("C:/Temp/testfolder/test.PNG");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        start = System.currentTimeMillis();
        while(bis.read() != -1) {}
        end = System.currentTimeMillis();
        System.out.println("bis " + (end -start)+"ms" );
        bis.close();
        fis2.close();
    }
}
