package tostring;

class Student {
    int rollNo;
    String name;
    int age;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ToStringDemo {
    public static void main(String[] args) {
        Student manish = new Student();
        manish.setName("Manish Kumar Jha");
        manish.setRollNo(101);
        manish.setAge(15);

        Student bibhash = new Student();
        bibhash.setRollNo(102);
        bibhash.setName("Bibhas Yadav");
        bibhash.setAge(20);

        System.out.println(manish);
        System.out.println(bibhash);
    }
}
