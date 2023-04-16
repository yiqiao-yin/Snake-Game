import java.util.Scanner;

public class ScannerClient {
    // This program uses a Scanner object to ask the user for
    // an integer and print its square and cube
    
    public static void main(String[] args) {
        // Declare a Scanner variable
        Scanner input;
        
        // Create and assign a Scanner object
        input = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Enter an integer: ");
        
        // Call the method "nextInt" on the Scanner object to read an integer from the user
        int num1 = input.nextInt();
        
        // Calculate the square of the integer
        int square = num1 * num1;
        
        // Print the result
        System.out.println("The square of " + num1 + " is " + square);
        
        // Calculate the cube of the integer
        int cube = num1 * num1 * num1;
        
        // Print the result
        System.out.println("The cube of " + num1 + " is " + cube);
    }
}