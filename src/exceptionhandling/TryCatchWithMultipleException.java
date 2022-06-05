package exceptionhandling;

public class TryCatchWithMultipleException {
    public static void main(String[] args) {

/*        try {
            int num1 = 10;
            int num2 = 0;

            int res = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("please enter valid number");
        }

        try {
            int[] numbers = new int[5];

            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            numbers[3] = 4;
            numbers[4] = 5;
            numbers[5] = 6;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is of size 5 only");
        }*/

        try {
            int num1 = 10;
            int num2 = 0;

            int res = num1 / num2;

            int[] numbers = new int[5];

            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            numbers[3] = 4;
            numbers[4] = 5;
            numbers[5] = 6;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error is: " + ex.getMessage());
        }
    }
}
