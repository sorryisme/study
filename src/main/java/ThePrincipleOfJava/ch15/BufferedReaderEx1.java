package ThePrincipleOfJava.ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line ="";
            for(int i=1;(line=br.readLine())!=null; i++) {
                if(line.indexOf(";") != -1) {
                    // ";" 붙어있지 않으면 출력하지 않는다
                    System.out.println(i+":"+line);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
