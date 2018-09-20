package kosta_java.ex0920.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExam {
    public ClientExam() {
        try {
            Socket sk = new Socket("127.0.0.1", 8000);
            // 서버에서 데이터 보내기
            
            PrintWriter pw = new PrintWriter(sk.getOutputStream(),true);
            pw.println("클라이언트에 접속중입니다.");
            
            //서버가 보내오는 데이터 읽기
            
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(sk.getInputStream()));
            String serverMessage = br.readLine();
            System.out.println("서버가 보내온 내용 :" +serverMessage);
            sk.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        new ClientExam();
    }
}
