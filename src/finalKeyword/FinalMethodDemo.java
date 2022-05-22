package finalKeyword;

class FinalMethodClass{
    public void display(){
        System.out.println("in display");
    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        FinalMethodClass finalMethodClass = new FinalMethodClass();
        finalMethodClass.display();
    }
}
