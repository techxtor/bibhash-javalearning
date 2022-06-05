package multithreading;

class TPHi implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Hi");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class TPHello implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Hello");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TPHi());
        Thread thread2 = new Thread(new TPHello());

        thread1.start();
        thread2.start();

        thread1.setPriority(Thread.MAX_PRIORITY);
//        thread.setPriority(Thread.MIN_PRIORITY);
//        thread.setPriority(Thread.NORM_PRIORITY); -> this is set by default

    }
}
