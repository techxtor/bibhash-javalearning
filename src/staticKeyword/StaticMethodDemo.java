package staticKeyword;

class Animals {
    public void speak(String sound) {
        System.out.println(sound);
    }

    public static void walk() {
        System.out.println("walking");
    }
}

class MyCalc {
    static int num1;
    static int num2;

    public static void add(int a, int b) {
        num1 = a;
        num2 = b;
        System.out.println(num1 + num2);
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        Animals cat = new Animals();
        cat.speak("meow meow");
//        cat.walk();

        Animals cow = new Animals();
        cow.speak("maa maa");
//        cow.walk();

        Animals.walk();

        MyCalc.add(10, 40);
    }
}

// Non-static field 'num1' cannot be referenced from a static context
// static method -> sirf static var
// non static method -> static/nonstatic var