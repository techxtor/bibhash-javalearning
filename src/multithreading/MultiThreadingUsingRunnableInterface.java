package multithreading;

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MultiThreadingUsingRunnableInterface {
    public static void main(String[] args) {
        Runnable a = new A();
        Runnable b = new B();

        Thread t1 = new Thread(a, "A Thread");
        Thread t2 = new Thread(b, "B Thread");
        t1.start();
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}
