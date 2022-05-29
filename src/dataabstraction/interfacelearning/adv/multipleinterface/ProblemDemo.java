package dataabstraction.interfacelearning.adv.multipleinterface;

interface A {
    void displayA();
    default void show() {
        System.out.println("in A show");
    }
}

interface B {
    void displayB();
    default void show() {
        System.out.println("in B show");
    }
}

class Impl implements A, B {

    @Override
    public void displayA() {

    }

    @Override
    public void displayB() {

    }

    @Override
    public void show() {
        System.out.println(" in impl show");
    }
}

public class ProblemDemo {
    public static void main(String[] args) {
//        Impl impl = new Impl();
//        impl.show(); // in impl show

        A a = new Impl();
        a.show();

        B b = new Impl();
        b.show();
    }
}

// if a class implements multiple interfaces, with same/common method ->
// confusion, which parent's method to call
