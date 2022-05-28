package dataabstraction;

// how to use abstract class
class AA {
//    public void writeInt(int b){
//        System.out.println(b);
//    }
//
//    public void writeDouble(double b){
//        System.out.println(b);
//    }

    // method overloading
    public void write(Integer num){
        System.out.println(num);
    }
    public void write(Double num){
        System.out.println(num);
    }
    public void write(Float num){
        System.out.println(num);
    }
}

class Magic {
    public void write(Number num){
        System.out.println(num);
    }
}

public class AbstractClassAdvDemo {
    public static void main(String[] args) {
        AA aa = new AA();
//        aa.writeInt(10);
//        aa.writeDouble(5.7);

//        aa.write(20.5);
//        aa.write(2);

//        Magic magic = new Magic();
//        magic.write(10);
//        magic.write(7.9);
//        magic.write(8.9f);

        Integer integer = new Integer("10");
        Double aDouble = new Double("5.5");

        Magic magic = new Magic();
        magic.write(integer);
        magic.write(aDouble);
    }
}

// capital letter data type -> non-primitive
// primitive