package thisJava.ch12.yield;

public class ThreadTest {
    static boolean work = false;
    
    
    public static void main(String[] args) throws Exception{
        Thread test = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while(true) {
                                if(work) {
                                    System.out.println(" true ");
                                } else {
                                    System.out.println(" false ");
                                }
                            }
                        }
                    }
                );
        
        test.start();
        
        for(int i = 0; i < 10; i++) {
            Thread.sleep(10000);
            work = !work;
        }
        
    } 
}
