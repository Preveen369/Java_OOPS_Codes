import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        /* System.out.println("Enter a number: "); // display output
        int num = System.in.read(); // returns ASCII int value
        System.out.println(num - 48); */

        // System.in -> STD INPUT STREAM [obj of InputStream]
        // System.out -> STD OUTPUT STREAM [obj of PrintStream]

        // BUFFERED INPUT STREAM READING:
        System.out.println("Enter a number: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

         // only considers the input in the form of string type
        int number = Integer.parseInt(bf.readLine());  
        System.out.println("Sum of numbers: " + (number+number));

        // SCANNER INPUT READING:
        System.out.println("\nEnter a number1: ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt(); // user input of desired type
        System.out.println("Sum of numbers1: " + (number1+number1));

        // since bf is a resource, we need to close it:
        bf.close();
        sc.close();
    }
}
