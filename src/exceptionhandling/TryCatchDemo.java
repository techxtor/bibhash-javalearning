package exceptionhandling;

public class TryCatchDemo {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 0;

        try {
            int result = num1 / num2;
            System.out.println("Hello World");
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println("Please enter valid number");
        }
        finally {
            System.out.println("Bye !");
        }
    }
}

//    Exception exception