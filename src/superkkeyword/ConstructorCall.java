package superkkeyword;

class A {
    public A() {
        System.out.println("in A default");
    }

    public A(String str){
        System.out.println("in A parameter");
    }
}

class B extends A{
    public B() {
//        super(); // -> this exists by default
        super("hello A");
        System.out.println("in B default");
    }

    public B(String str){
//        super(); // -> this exists by default
        super("hello A");
        System.out.println("in B parameter");
    }
}

public class ConstructorCall {
    public static void main(String[] args) {
        B b = new B();
        B b1 = new B("manish");
    }
}

// super -> parent -> A
// super(); -> parent() -> A()
// super("hello"); -> parent("hello") -> A("hello")

// super() is used to call parents constructor
// super exists by default [calls default constructor of parent]
// to call parameterized constructor of parent -> super(params) should be added explicitly
