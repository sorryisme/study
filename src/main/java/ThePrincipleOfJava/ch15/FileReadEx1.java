package ThePrincipleOfJava.ch15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx1 {
    public static void main(String[] args) {
        try {
            String fileName ="test.txt";
            FileInputStream fis = new FileInputStream(fileName);
            FileReader fr = new FileReader(fileName);
            int data = 0;
            //FileInputStream을 이용해서 파일 내용을 읽어 화면에 출력
            while((data = fis.read()) != -1 ) {
                System.out.print((char)data);
            }
            
            System.out.println();
            fis.close();
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            //FileReader를 이용해서 파일 내용을 읽어 화면에 출력한다
            while((data=fr.read()) != -1)
                System.out.print((char)data);
            System.out.println("--------------------");
           
            
            String tmp = "";
            while((tmp=br.readLine()) != null){
                System.out.println(tmp);
            }
            
            br.close();
            fr.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
