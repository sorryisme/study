package thisJava.ch12.ex14;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup myGroup = new ThreadGroup("myGroup");
        WorkThread workThreadA = new WorkThread(myGroup, "workThredA");
        WorkThread workThreadB = new WorkThread(myGroup, "workThredB");
        
        workThreadA.start();
        workThreadB.start();
        
        System.out.println("main 스레드 그룹의 list() 메소드 출력 내용");
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();
        
        System.out.println();
        
        try { Thread.sleep(3000); } catch ( InterruptedException e) { }
        myGroup.interrupt();
        
    }
}
