package dataabstraction;

class A {
//    public abstract void display();
}

abstract class Calculator {
    public int sum(int x, int y) {
        System.out.println(x+y);
        return x+y;
    }
    public abstract int sub(int x, int y);
    public abstract int mul(int x, int y);
    public abstract int div(int x, int y);
}

abstract class Hello {
    public void display(){
        System.out.println("hello");
    }
}

class Casio extends Calculator {

    @Override
    public int sub(int x, int y) {
        System.out.println(x-y);
        return x-y;
    }

    @Override
    public int mul(int x, int y) {
        System.out.println(x*y);
        return x*y;
    }

    @Override
    public int div(int x, int y) {
        System.out.println(x/y);
        return x/y;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Casio casio = new Casio();
        int sum = casio.sum(20, 10);
        int sub = casio.sub(20, 10);
        int mul = casio.mul(20, 10);
        int div = casio.div(20, 10);

//        Hello hello = new Hello();
    }
}

// abstract -> no details
// only abstract class can have abstract member function
// abstract class can have both - abstract function as well as non-abstract function
// when a class extends abstract class -> it must implement all its abstract member function
// abstract class can not be instanceiated
