package exceptionhandling.userdefinedexception;

import exceptionhandling.checkedexception.BibhashException;

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
       /* int i, j;
        i = 8;
        j = 9;
        try {
            int k = i / j;
            if (k == 0) {
                throw new Exception();
            }
            System.out.println(k);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }*/

        int i, j;
        i = 8;
        j = 9;
        try {
            int k = i / j;
            if (k == 0) {
                throw new BibhashException("This is Bibhash Exception");
            }
            System.out.println(k);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
