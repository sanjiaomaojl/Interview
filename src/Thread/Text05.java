package Thread;

public class Text05 {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        Thread thread0 = new Thread(runnable);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread0.start();
        thread1.start();
        thread2.start();
    }
}
