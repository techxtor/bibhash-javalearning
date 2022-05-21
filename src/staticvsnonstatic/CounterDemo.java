package staticvsnonstatic;

class Counter {
    int count;

    public Counter() {
        count++;
        System.out.println("Count is : " + count);
    }
}

class StaticCounter {
    static int count;

    public StaticCounter() {
        count++;
        System.out.println("Count is : " + count);
    }
}

public class CounterDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        StaticCounter c3 = new StaticCounter();
        StaticCounter c4 = new StaticCounter();
    }
}
