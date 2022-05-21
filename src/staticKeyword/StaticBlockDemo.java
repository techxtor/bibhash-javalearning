package staticKeyword;

class AreaOfCircle {
    int radius;
    static double pi;

    // used for initializing instance/object variable
    public AreaOfCircle(int radius) {
        this.radius = radius;
    }

    // instance block
//    {
//        this.radius = 10;
//    }

    // static block
    static {
        pi = 3.14;
    }

    public void area() {
        System.out.println(pi * radius * radius);
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
//        AreaOfCircle.pi = 20;
        AreaOfCircle dc1 = new AreaOfCircle(10);
        dc1.area();

        AreaOfCircle dc2 = new AreaOfCircle(20);
        dc2.area();
    }
}