package userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) throws IOException {
        // Take Input - Scanner
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        // Take Input - BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter age");
        String age = reader.readLine();
        System.out.println("Age is: " + age);
    }
}
