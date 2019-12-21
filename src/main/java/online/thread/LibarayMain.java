package online.thread;

import java.util.ArrayList;

public class LibarayMain {
    public static FastLibrary library = new FastLibrary();
    
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student st5 = new Student();
        Student st6 = new Student();
        Student st7 = new Student();
        Student st8 = new Student();
        
        st1.start();
        st2.start();
        st3.start();
        st4.start();
        st5.start();
        st6.start();
        st7.start();
        st8.start();
        
    }
}
class Student extends Thread {
    
    public void run() {
        try{
            String title =LibarayMain.library.lendBook();
            if(title == null) return;
            sleep(2000);
            LibarayMain.library.returnBook(title);
        } catch (InterruptedException e) {
           e.printStackTrace();
        } catch (Exception e) {
           e.printStackTrace();  
        }
        
    }
}


class FastLibrary {
    public ArrayList<String> books = new ArrayList<String>();
    
    public FastLibrary() {
        books.add("책이름1");
        books.add("책이름2");
        books.add("책이름3");
        books.add("책이름4");
    }
    
    public synchronized String lendBook() throws InterruptedException{
        
        Thread t = Thread.currentThread();
        
//        while (books.size() == 0 ) { //book.size() 0일때만 깨어났다가 다시 wait으로 빠진다
        if(books.size() == 0  ) { // notifyall로 인해 다시 깨어났다가 하단에서 indexOutofBound Exception 발생
            System.out.println(t.getName() + " wait start");
            wait();
            System.out.println(t.getName() + " wait end");
        }
        String title = books.remove(0);
        System.out.println(t.getName() + ":" +title + " lend");
        return title;
    }
    
    public synchronized void returnBook(String title) {
        Thread t = Thread.currentThread();
        books.add(title);
        //notify();
        notifyAll();
        
        System.out.println(t.getName() + ":" +title +" return");
    }
    
    
}