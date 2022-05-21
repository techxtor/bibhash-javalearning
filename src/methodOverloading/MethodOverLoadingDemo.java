package methodOverloading;

class Alpha {
    public int add(int i, int j) {
        return i + j;
    }

    public int add(int i, int j, int k) {
        return i + j + k;
    }

    public double add(double d1, double d2, double d3) {
        return d1 + d2 + d3;
    }
}

public class MethodOverLoadingDemo {
    public static void main(String[] args) {
        Alpha alp = new Alpha();
        System.out.println(alp.add(1, 2, 3));
        System.out.println(alp.add(1, 2));
        System.out.println(alp.add(2.5, 3.9, 9.9));
    }
}
