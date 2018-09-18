package kosta_java.ex0918;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import javax.swing.JOptionPane;

public class FileExam {
	public FileExam() throws IOException{
	    String path = JOptionPane.showInputDialog("파일경로는 ??");
        System.out.println("path : " +path);
        File file = new File(path);
        if(file.exists()) {//존재 여부 체크
            if(file.isDirectory()) {
                
                System.out.println(path + "폴더 LIST *************");
                
                String fileList [] = file.list();
                    for(String name : fileList)
                    System.out.println(name);
            }else {//폴더가 아닐 경우
                System.out.println("읽기 가능 : " + file.canRead());
                System.out.println("쓰기 가능 : " + file.canWrite());
                System.out.println("절대경로 : " + file.getAbsolutePath());
                System.out.println("용량: " + file.length());
                System.out.println("파일이름: " + file.getName());
                System.out.println("마지막 수정일: " + file.lastModified());
                System.out.println(new Date(file.lastModified()).toLocaleString());
            }
        } else {
            // 파일 생성
            //file.createNewFile();
            // 폴더 생성
            file.mkdirs();
            System.out.println(file+"생성되었습니다.");
        }
    }
	public static void main(String[] args) throws IOException{
		
		new FileExam();
	}
}
