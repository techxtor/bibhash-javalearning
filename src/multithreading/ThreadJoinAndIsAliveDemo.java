package multithreading;

class HiClass implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }
}

class HelloClass implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}

public class ThreadJoinAndIsAliveDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new HiClass(), "Hi Thread");
        Thread t2 = new Thread(new HelloClass(), "Hello Thread");
        t1.start();
        t2.start();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        t1.join();
        t2.join();

        System.out.println("Bye");

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}

/*
* thread.start -> thread alive
* thread.join -> khatam, good bye tata, gaya
*
* main thread from line 34 to 37 will run after all join is done*/
