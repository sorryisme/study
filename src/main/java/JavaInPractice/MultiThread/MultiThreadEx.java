package JavaInPractice.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadEx implements Runnable {
    
    private static final String MSG_TEMPLATE = "출력 중입니다 [%s][%d회쨰]";
    
    private final String threadName;

    public MultiThreadEx(String threadName) {
        this.threadName = threadName;
    }
    
    
    public void run() {
        for(int i = 1;  i < 100; i++) {
            System.out.println(String.format(MSG_TEMPLATE, threadName, i));
        }
    }
    
    public static void main(String[] args) {
        MultiThreadEx runnable1 = new MultiThreadEx("thread1");
        MultiThreadEx runnable2 = new MultiThreadEx("thread2");
        MultiThreadEx runnable3 = new MultiThreadEx("thread3");
        
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(runnable1);
        executorService.execute(runnable2);
        executorService.execute(runnable3);
                
//        executorService.shutdown();
        
        try {
            System.out.println("try");
            if(!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
                //만약 동작 금지시 shutdown 
                System.out.println("await");
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            executorService.shutdownNow();
        }
    }
    
    
    
}
