package polymorphism.runtimePolymorphism;

class A {
    public void display(){
        System.out.println("in display");
    }
    public void print(){
        System.out.println("in A print");
    }
}

class B extends A{
    public void hello() {
        System.out.println(" in B hello");
    }
}

class C extends A{
    @Override
    public void print(){
        System.out.println("in C print");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        A a = new A();
        a.print();

        B b = new B();
        b.print();

        C c = new C();
        c.print();
    }
}
