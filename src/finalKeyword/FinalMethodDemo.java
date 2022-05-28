package finalKeyword;

class FinalMethodClass{
    public final void display(){
        System.out.println("in display");
    }
    public final void display(int x){
        System.out.println("in display");
    }
}

class FinalMethodOverride extends FinalMethodClass {
//    @Override
//    public void display(){
//
//    }
//    @Override
//    public void display(int x){
//
//    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        FinalMethodClass finalMethodClass = new FinalMethodClass();
        finalMethodClass.display();
    }
}

// final method can not be overridden
// final method can be overloaded