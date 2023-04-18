import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        // create a Scanner object to obtain user input
        Scanner input = new Scanner(System.in);

        // ask the user to enter a number
        System.out.print("Enter a number: ");

        // read the user's input
        int n = input.nextInt();

        // calculate and display the Fibonacci series up to n
        int firstNum = 0, secondNum = 1;
        System.out.print("Fibonacci Series up to " + n + ": " + firstNum + ", " + secondNum);
        for (int i = 2; i < n + 1; i++) {
            int nextNum = firstNum + secondNum;
            System.out.print(", " + nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
