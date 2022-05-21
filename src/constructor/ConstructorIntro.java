package constructor;

class Calculator {
    int num1;
    int num2;

//    public int sum(int a, int b) {
//        return a + b;
//    }

    public int sum() {
        return num1 + num2;
    }

    public Calculator() {
        System.out.println("in constructor");
        num1 = 10;
        num2 = 20;
    }
}

public class ConstructorIntro {
    public static void main(String[] args) {
        /*
        Calculator ccal1 = new Calculator();
        ccal1.num1 = 10;
        ccal1.num2 = 20;
        int result = ccal1.sum(ccal1.num1, ccal1.num2);
        */

        Calculator ccal1 = new Calculator();
        int result = ccal1.sum();
        System.out.println(result);

//        Calculator ccal2 = new Calculator();

    }
}
