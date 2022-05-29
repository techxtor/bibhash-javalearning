package dataabstraction.interfacelearning.adv;

interface Alpha {
    void display();
    void ulfa();
}

//class Beta implements Alpha{
//    @Override
//    public void display(){
//        System.out.println("hello Alpha");
//    }
//}

public class InterfaceWithAnonymousClass {
    public static void main(String[] args) {
//        Alpha alpha = new Beta();
//        alpha.display();

        Alpha alpha = new Alpha() {
            @Override
            public void display() {
                System.out.println("hello Alpha");
            }
            @Override
            public void ulfa() {
                System.out.println("hello Alpha from ulfa");
            }
        };

        alpha.display();
        alpha.ulfa();
    }
}
