package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        /*BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number: ");
        double i = Double.parseDouble(b.readLine());
        System.out.println(i);*/

        try (Scanner s = new Scanner(System.in))
        {
            System.out.println("Enter the number: ");
            double i = s.nextDouble();
            System.out.println(i);
        }

    }
}
