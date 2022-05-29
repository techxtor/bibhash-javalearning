package dataabstraction.interfacelearning.adv.staticmethodinterface;

interface A  {
//    final int num = 10;
    int num = 10;

    // interface abstract method can not have body
//    void display() { // public abstract
//        System.out.println("hello");
//    }

    default void display(){
        System.out.println("hello");
    }

    static void staticDisplay() {
        System.out.println(" static hello");
    }
}

public class StaticMethodInterfaceDemo implements A {
    public void show(){
         display();
    }
    public static void main(String[] args) {
//        num = 30; // can not assign value to final variable
//        this.staticDisplay -> static is for class, this is for obj
//        this.show(); -> static method can only have static body
//        this.display(); -> static method can only have static body
        A.staticDisplay();
    }
}
