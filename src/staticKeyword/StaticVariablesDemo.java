package staticKeyword;

class Employee {
    //static - class k prop
    static String CEO;

    // instance - obj k prop
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public void setCEO(String CEO) {
//        this.CEO = CEO;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class StaticVariablesDemo {
    public static void main(String[] args) {
        Employee.CEO = "Navin";

        Employee emp1 = new Employee();
        emp1.setName("Manish");
        emp1.setId(1);
//        emp1.setCEO("Naveen");

//        Employee.CEO = "Prabhas";

        Employee emp2 = new Employee();
        emp2.setName("Bibhash");
        emp2.setId(2);
//        emp2.setCEO("Naveen");

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp2.CEO);
        System.out.println(emp1.CEO);
    }
}
