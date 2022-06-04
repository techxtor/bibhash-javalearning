package dataabstraction.interfacelearning.adv;

interface AA {
    default void show() {
        System.out.println("in show");
    }
}

class BB implements AA {
    public void show() {
        System.out.println("Overriding show of interface");
    }
}

public class DefaultMethodInterfaceDemo {

    public static void main(String[] args) {
        AA aa = new BB();
        aa.show();
    }
}
