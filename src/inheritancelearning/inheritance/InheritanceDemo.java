package inheritancelearning.inheritance;

class SimpleCalculator{ //parent, base, super
    public int sum(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
}

class AdvCalculator extends SimpleCalculator { // child, extended, sub
//    public int sum(int a, int b){
//        return a + b;
//    }
//    public int sub(int a, int b){
//        return a - b;
//    }
    public int mul(int a, int b){
        return a * b;
    }

}

class SuperCalculator extends AdvCalculator {
//    public int mul(int a, int b){
//        return a * b;
//    }
    public int div(int a, int b){
        return a / b;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        AdvCalculator advCalculator = new AdvCalculator();
        int res = advCalculator.sub(20, 10);
        System.out.println(res);

        SuperCalculator superCalculator = new SuperCalculator();
        System.out.println(superCalculator.mul(2, 3));

    }
}
