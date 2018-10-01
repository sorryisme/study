package kosta_java.ex0920.multichat;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUIChatExam extends JFrame{

    JTextArea textArea = new JTextArea();
    JScrollPane jsp = new JScrollPane(textArea);
    JTextField text =new JTextField();  
    Socket sk;
    BufferedReader br;
    PrintWriter pw;
    /**
     * 화면구성
     */
    public ClientGUIChatExam() {
        super("ClientGUIChat");
        Container con = super.getContentPane();
        con.add(jsp, "Center");
        con.add(text,"South");
        
        // 옵션 설정
        textArea.setFocusable(false);
        textArea.setBackground(Color.white);
        text.requestFocus();
        
        
        setSize(400,300);
        setLocationRelativeTo(null); // 정중앙
        setVisible(true); //보여줘
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x 클릭시 프로세스 종료 
        
        //서버 접속 시도
        this.connection();
        //이벤트 등록 : 이벤트 주체 .addxxxListener(이벤트 구현 클래스 );
        
        text.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                //textField값 읽기
                String inputData = text.getText();
                pw.println(inputData);
                
                text.setText("");
                
            }
        });
        
        
        
    }
    
    public void connection() {
        try {
            sk = new Socket("192.168.0.111",8000);
            String name = JOptionPane.showInputDialog("대화명을 입력해주세요");
            
            br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
            pw = new PrintWriter(sk.getOutputStream(),true);
            
            // 대화명 전송하기
            
            pw.println(name);
            
            new Thread() {

                @Override
                public void run() {
                    try {
                        String data = null;
                        while((data = br.readLine()) != null ) {
                            textArea.append(data+"\n");
                            textArea.setCaretPosition(textArea.getText().length());
                            // 스크롤이 따라 내려가는 것
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                };
                
            }.start();
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
    
    public static void main(String[] args) {
        new ClientGUIChatExam();
    }
}
