package exceptionhandling.checkedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter Name");
            String name = reader.readLine();
            System.out.println("Your name is : " + name);
        }
    }
}
