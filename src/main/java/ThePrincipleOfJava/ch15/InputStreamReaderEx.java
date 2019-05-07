package ThePrincipleOfJava.ch15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
    public static void main(String[] args) {
        String line ="";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("사용 중인 OS 인코딩:" + isr.getEncoding());
            
            do {
                System.out.println("문장을 입력하세요 마치려면 q를 입력하세요");
                line = br.readLine();
                System.out.println("입력하신 문장은 : "+line);
            } while(!line.equalsIgnoreCase("q"));
            //br.close(); // System.in 같은 표준 입출력은 닫지 않아도 된다
            System.out.println("프로그램을 종료");
        } catch (IOException e) {}
    }
}
