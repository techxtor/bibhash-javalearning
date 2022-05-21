package constructor;

class SumCalculator {
    int nums1;
    int nums2;

    public SumCalculator() {
        System.out.println("in default constructor");
    }

    public SumCalculator(int a, int b) {
        System.out.println("in parameterized constructor");
        nums1 = a;
        nums2 = b;
    }

    public SumCalculator(int a, double b) {
        System.out.println("in parameterized constructor");
        nums1 = a;
        nums2 = (int) b;
    }

    public SumCalculator(int a, int b, int c) {
        System.out.println("in parameterized constructor");
        nums1 = a;
        nums2 = b;
    }

    public int sum() {
        return nums1 + nums2;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        SumCalculator c1 = new SumCalculator(10, 20);
        SumCalculator c2 = new SumCalculator(40, 50, 10);
        SumCalculator c3 = new SumCalculator(40, 10.6);
        System.out.println(c1.sum());
        System.out.println(c2.sum());
        System.out.println(c3.sum());
    }


}
