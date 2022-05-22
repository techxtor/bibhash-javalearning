package polymorphism.runtimePolymorphism;

class AA {
    public void display() {
        System.out.println("in A display");
    }

    public void print() {
        System.out.println("in A print");
    }
}

class BB extends AA {
    @Override
    public void display() {
        System.out.println("in B display");
    }

    @Override
    public void print() {
        System.out.println("in B print");
    }
}

class CC extends AA {
    @Override
    public void display() {
        System.out.println("in C display");
    }

    public void helloCC(){
        System.out.println(" in helloCC");
    }
}

public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
//        BB bb = new BB();
//        bb.display();
//        bb.print();

        // Dynamic Method Dispatch
        AA aa;
        aa = new CC();
        aa.display();
        aa.print();

        aa = new BB();
        aa.print();
        aa.display();

    }
}

// Parent/super reference can have child/sub object
// parent/super reference can access only those members that reference knows