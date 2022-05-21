package loops;

public class ForLoopDemo {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

//        for (int i=0; i<numbers.length; i++){
//            System.out.println(" " + numbers[i]);
//        }

        // enhanced for loop
        for (int number : numbers) {
            System.out.println(" " + number);
        }
    }
}
