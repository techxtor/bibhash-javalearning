package multithreading;

class Counter{
    int count; // t1= 500, t2 = 500

//    public void increment(){
//        count++; // count = count+1; t1 = 501, t2 = 501
//    }

    // blocking
    public synchronized void increment(){
        count++; // count = count+1; t1 = 501, t2 = 502
    }
}

public class SynchronizeDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("count is: " + counter.count);
    }
}
