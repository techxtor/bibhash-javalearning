package encapsulation;

class MyClass {
    private int i;
    private int j;

    //Constructor
    public MyClass() {
    }

    // Getters and Setters
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setI(10);
        myClass.setJ(20);

        System.out.println(myClass.getI());
        System.out.println(myClass.getJ());
    }
}
