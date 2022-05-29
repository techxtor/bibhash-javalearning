package dataabstraction.whyinterface;

interface A
{

}

interface B {

}

class C {

}

class D extends C  implements A, B{

}

public class InheritanceSolution {
    public static void main(String[] args) {
        D d = new D();

        A a = new D();

        B b = new D();

        C c = new D();
    }
}
