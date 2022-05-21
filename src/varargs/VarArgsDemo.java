package varargs;

class SumAll {
    public int sumOfAll(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

public class VarArgsDemo {
    public static void main(String[] args) {
        SumAll sumAll = new SumAll();
        int result = sumAll.sumOfAll(1, 2, 3, 4, 5, 6, 7, 10);
        System.out.println(result);
    }
}
