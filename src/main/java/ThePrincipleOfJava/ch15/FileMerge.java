package ThePrincipleOfJava.ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileMerge {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("usage : java Filemerge FileNmae");
            System.exit(0);
        }
        
        String mergeFilename = args[0];
        try{
            File tempFile = File.createTempFile("~mergetemp", "tmp");
            tempFile.deleteOnExit();
            
            FileOutputStream fos = new FileOutputStream(tempFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            BufferedInputStream bis = null;
            int number = 1;
            File f = new File(mergeFilename +"_."+number);
            while(f.exists()) {
                f.setReadOnly();
                // 작업 중 파일내용이 변경되지 않도록 처리 
                bis = new BufferedInputStream(new FileInputStream(f));
                
                int data = 0;
                while((data = bis.read()) != -1) {
                    bos.write(data);
                }
                
                bis.close();
                f = new File(mergeFilename + "_."+ ++number);
            }
            bos.close();
            
            File oldFile = new File(mergeFilename);
            if(oldFile.exists())
                oldFile.delete();
            
            tempFile.renameTo(oldFile);
        } catch (Exception e) {}
        
        
        
    }
}
