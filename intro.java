import java.util.Scanner;

public class intro {
    // This program uses a Scanner object to ask the user for
    // an integer and print its square and cube
    
    public static void main(String[] args) {


        // int x = 4000;
        // long y = 10000L;
        // long z = x + y;
        // double a = 3.14;
        // boolean b = true;
        // int c = 1;
        // System.out.println(b);

        // Declare a Scanner variable
        Scanner input;
        
        // Create and assign a Scanner object
        input = new Scanner(System.in);
        
        // Prompt the user for input
        int n = input.nextInt();

        // Initiate 2 numbers
        int firstNum = 0, secondNum = 1;

        for (int i = 2; i < n + 1; i++) {
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;

            System.out.println("The result F-series is " + nextNum);
        }

        // System.out.println("The result F-series is " + nextNum);

    }
}