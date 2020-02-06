package thisJava.ch18.ex04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {

        try{ 
            InputStream fis = new FileInputStream("C:/Temp/file1.txt");
            String targetFileName = "C:/Temp/output.txt";
            FileOutputStream fos = new FileOutputStream(targetFileName);
            
            int readByteNo;
            byte[] readByte = new byte[1024];
            
            while( (readByteNo = fis.read(readByte)) != -1 ){
                fos.write(readByte);
            }

            fos.flush();
            fos.close();
            fis.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
