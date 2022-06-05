package multithreading;

class Hi extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }
//    public void show() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hi");
//        }
//    }
}

class Hello extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
//    public void show() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello");
//        }
//    }

}

public class MultiThreadingDemoUsingThreadClass {
    public static void main(String[] args) {
        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.start();
        hello.start();

        hi.setName("Hi Thread");
        hello.setName("Hello Thread");
        System.out.println(hi.getName());
        System.out.println(hello.getName());

//        hi.show();
//        hello.show();
    }
}

//    Exception in thread "main"
//by default java runs on "main thread"