package exceptionhandling.checkedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExcpDemo {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Enter Name");
            String name = reader.readLine();
            System.out.println("Your name is : " + name);
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}

// checked exception -> program knows that there might be an exception
// -> compile time exception
// resolve checked exception by2 method:
//1. add throws "Exception_Type" at method level
// 2. enclose in try/catch
