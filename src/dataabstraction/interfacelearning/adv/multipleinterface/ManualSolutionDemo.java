package dataabstraction.interfacelearning.adv.multipleinterface;

interface Father {
    default void show() {
        System.out.println("father");
    }
}

interface Mother {
    default void show() {
        System.out.println("mother");
    }
}

class Baby implements Father, Mother{
    @Override
    public void show() {
        System.out.println("baby");
    }
}

public class ManualSolutionDemo {
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.show();

        Father baby1 = new Baby();
        baby.show();

        Mother baby2 = new Baby();
        baby.show();
    }
}
