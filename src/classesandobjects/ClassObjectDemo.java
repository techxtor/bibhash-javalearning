package classesandobjects;

class Animal {
    // properties, attributes
    String color;

    // functions, methods
    public void speak() {
        System.out.println("I am speaking");
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.color = "black";
        dog.speak();
        System.out.println(dog.color);
    }
}
