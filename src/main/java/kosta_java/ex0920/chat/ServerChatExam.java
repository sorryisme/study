package kosta_java.ex0920.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChatExam {
    ServerSocket server;
    Socket sk;
    public ServerChatExam() {
        try {
            server = new ServerSocket(8000);
            System.out.println("클라이언트 접속을 기다립니다");
            sk = server.accept();
            System.out.println(sk.getInetAddress() + "님과 채팅을 시작합니다.");
            
            //읽기 Thread - 받기
            new Thread() {
                
                @Override
                public void run() {
                    try {
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(sk.getInputStream()));
                    
                    String data =null;
                    while((data=br.readLine()) != null) {
                        System.out.println(data);
                    }
                    
                    } catch (Exception e) {
                        System.out.println("Server Recive 에러");
                        e.printStackTrace();
                    }
                    
                }
            }.start();
            
            //쓰기 Thread - 보내기
            new SendThread(sk,"[SERVER가 보낸 내용]").start();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new ServerChatExam();
    }
}
