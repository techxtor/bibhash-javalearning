package operators;

public class OperatorDemo {
    public static void main(String[] args) {
        // Arithmetic Operator
        int a = 10;
        int b = 20;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = (double) a / b;
        int mod = a % b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
    }
        // Logical Operator
        {
            boolean b1 = true;
            boolean b2 = false;

            System.out.println(b1 && b2);
            System.out.println(b1 || b2);
            System.out.println(b1 != b2);
        }
        // Bitwise Operator
        // Java program to illustrate
// bitwise operators
        {
                int p = 5;
                int q = 7;

                // bitwise and
                System.out.println("a&b = " + (p & q));

                // bitwise or
                System.out.println("a|b = " + (p | q));
                //Bitwise xor
                System.out.println("a^b = " + (p ^ q));
//                bitwise not
                System.out.println("~p = " + ~p);

                p &= q;
                System.out.println("p= " + p);
            }


        // Relational Operator
        {
        int x = 10;
        int y = 20;

        System.out.println("a == b = " + (x == y) );
        System.out.println("a != b = " + (x != y) );
        System.out.println("a > b = " + (x > y) );
        System.out.println("a < b = " + (x < y) );
        System.out.println("b >= a = " + (x >= y) );
        System.out.println("b <= a = " + (x <= y) );
    }
}

/*
Arithmetic
Logical
Relational
Bitwise

        */
