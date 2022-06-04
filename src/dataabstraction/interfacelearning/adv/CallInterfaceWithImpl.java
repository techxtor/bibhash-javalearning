package dataabstraction.interfacelearning.adv;

public class CallInterfaceWithImpl {
    public static void main(String[] args) {
//        Abc abc = new Abc();
//        AbcImpl abcImpl = new AbcImpl();
//        Abc2Impl abc2Impl = new Abc2Impl();

        Abc abc = new AbcImpl();
        Abc abc2 = new Abc2Impl();

    }
}

// interface can not be instanciated
// but we can have reference of interface and object of its implementation
