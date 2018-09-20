package kosta_java.ex0920.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
    public ServerExam() {
        try {
            ServerSocket server = new ServerSocket(8000);   
            while(true) {
                System.out.println("Client 접속을 기다립니다");
                Socket sk = server.accept();
                System.out.println(sk.getInetAddress() + "님 접속되었습니다....");
                
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(sk.getInputStream()));
                
                String clientMessage = br.readLine();
                System.out.println("client 보내온 내용 :" + clientMessage);
                
                //클라이언트에게 데이터 전송하기
                //BufferedWriter bw = new BufferedWriter(
                //  new OutputStreamWriter(sk.getOutputStream());
                PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
                pw.println("잘못오신 거 같아요");
                //auto flush
                sk.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ServerExam();
    }
}
