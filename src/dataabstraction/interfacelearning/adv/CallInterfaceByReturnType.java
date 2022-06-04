package dataabstraction.interfacelearning.adv;

class Temp {
    public Abc someMethod(){
        return new AbcImpl();
    }
}
public class CallInterfaceByReturnType {

    public static void main(String[] args) {
        Abc abc = new Temp().someMethod();
    }
}

// return type se seho interface bana sakai xi.



// no parent obj
// no impl objcet
