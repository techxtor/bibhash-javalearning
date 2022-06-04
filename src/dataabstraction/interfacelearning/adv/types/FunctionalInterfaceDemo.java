package dataabstraction.interfacelearning.adv.types;

@FunctionalInterface
interface Alpha {
    void display();
//    void anotherDisplay();

    default void print() {

    }
    default void prints() {

    }
}



public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
//        Alpha alpha = new Alpha() {
//            @Override
//            public void display(){
//                System.out.println("hello");
//            }
//        };

//        Alpha alpha = () -> System.out.println("hello");

        Alpha alpha = () -> {
            System.out.print("hello ");
            System.out.println("world");
        };
        alpha.display();
    }
}

// Normal
// marker
// SAm  [single abstract method] - which has only one abstract method - Functional Interface -Lambda Expression
