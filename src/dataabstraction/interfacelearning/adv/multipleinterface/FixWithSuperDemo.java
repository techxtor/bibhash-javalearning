package dataabstraction.interfacelearning.adv.multipleinterface;

interface Fathers {
    default void show() {
        System.out.println("father");
    }
}

interface Mothers {
    default void show() {
        System.out.println("mother");
    }
}

class Babies implements Fathers, Mothers {

    @Override
    public void show() {
        Fathers.super.show();
        Mothers.super.show();
    }
}

public class FixWithSuperDemo {
    public static void main(String[] args) {
        Babies babies = new Babies();
        babies.show();
    }
}
