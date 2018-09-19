package kosta_java.ex0918.ex02;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "C:\\Users\\sorry\\git\\study\\src\\main\\java\\kosta_java\\ex0918\\FileExam.java");
            int data;
            while( (data = fis.read()) != -1) {
                System.out.write(data);
            }
            fis.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
