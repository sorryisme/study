package thisJava.ch12.ex04;

public class ThreadStateExample {
    public static void main(String[] args) {
        StatePrintThread statePrintThread =
                new StatePrintThread(new TargetThread());
        statePrintThread.start();
    }
}
