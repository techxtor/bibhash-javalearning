package conditionals;

public class IfElseDemo {
    public static void main(String[] args) {
        // If-Else
        int a = 20;
        int b = 20;
        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        String str1 = "Manish";
        String str2 = "Manish";
//        String str2 = "Bibhash";
        /*if(str1==str2){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }*/
        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        // If-Else-IF
        if (a == b) {
            System.out.println("In if");
        } else if (a != b) {
            System.out.println("In else-if");
        } else {
            System.out.println("in else");
        }
    }
}

// Primitive -> ==
// Non-Primitive (Reference) -> .equals()
