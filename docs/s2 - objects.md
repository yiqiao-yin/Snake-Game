# Objects in Java

## Instances of Objects

In Java, objects are instances of a class. When we create an object, we create an instance of that class.

Here's an example of creating an instance of a simple `Person` class:
```java
public class Person {
    String name;
    int age;
}

// Create an instance of the Person class
Person person = new Person();
person.name = "John Smith";
person.age = 30;
```

## Storing Variables Inside of Class Objects

We can store variables inside of an object by defining them as fields in the class. Fields are like variables, but they belong to a specific instance of the class.

Here's an example of defining fields in the `Person` class:
```java
public class Person {
    String name;
    int age;
}

// Create an instance of the Person class
Person person = new Person();

// Set the fields of the person object
person.name = "John Smith";
person.age = 30;
```

## Void and Non-Void Methods

Methods in classes can either be void or non-void. A void method does not return anything, whereas a non-void method returns a value of a specific type.

Here's an example of a void method in the `Person` class that prints out the person's name and age:
```java
public class Person {
    String name;
    int age;
    
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Create an instance of the Person class
Person person = new Person();
person.name = "John Smith";
person.age = 30;

// Call the printInfo method on the person object
person.printInfo();
```

And here's an example of a non-void method in the `Person` class that calculates the person's birth year:
```java
public class Person {
    String name;
    int age;
    
    public int getBirthYear() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - age;
    }
}

// Create an instance of the Person class
Person person = new Person();
person.name = "John Smith";
person.age = 30;

// Call the getBirthYear method on the person object
int birthYear = person.getBirthYear();
System.out.println("Birth Year: " + birthYear);
```

### Differences between Void and Non-void Methods

In Java, a void method is a method that does not return any value, whereas a non-void method returns a value of a specific type. 

Here's an example of a void method:
```java
public void printName(String name) {
    System.out.println("Name: " + name);
}
```

This method takes a `String` parameter called `name` and prints it to the console. However, notice that it does not have a `return` statement - that means it doesn't return any value.

Here's an example of a non-void method:
```java
public int addNumbers(int num1, int num2) {
    int sum = num1 + num2;
    return sum; 
}
```

This method also takes two integer parameters (`num1` and `num2`) but instead of printing anything to the console, it adds the two numbers together and returns the result as an integer. Notice that the method has a `return` statement, and that it specifies the return type (`int`) in its method signature.

The main difference between these two types of methods is that a void method does not return anything, while a non-void method returns a value of a specific type that can be used in other parts of your code.

### Example: Using Scanner Class

```java
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
```

## Fundamental Programming Constructs

The description you provided is referring to the fundamental programming constructs that are used in algorithms, which include sequencing, selection, and iteration.

- **Sequencing** refers to the ordering of individual statements or actions. In Java, sequencing is accomplished by listing a series of operations one after the other, separated by semicolons. For example:

```java
// Define an integer variable named x and initialize it with a value of 5
int x = 5;

// Define an integer variable named y and initialize it with a value of 10
int y = 10;

// Add the values of x and y together and store the result in a new variable named z
int z = x + y;

// Print out the sum of x and y using the value stored in the z variable
System.out.println("The sum of " + x + " and " + y + " is " + z + ".");
```

This code segment demonstrates sequencing, as each statement is executed in order from top to bottom.

- **Selection** involves making decisions based on conditions. In Java, selection is accomplished using conditional statements such as `if`, `else if`, and `else`. For example:

```java
// Define an integer variable named age and initialize it with a value of 20
int age = 20;

// Check if the age is greater than or equal to 18
if (age >= 18) {
    // If the age is greater than or equal to 18, print that the person is old enough to vote
    System.out.println("You are old enough to vote.");
} else {
    // If the age is less than 18, print that the person is not yet old enough to vote
    System.out.println("You are not old enough to vote yet.");
}
```

This code segment demonstrates selection, as the program chooses which message to print based on the value of the `age` variable.

- **Iteration** involves repeating a set of instructions until a condition is met. In Java, iteration is typically accomplished using loops such as `for` and `while`. For example:

```java
int i; // Declaring a variable i of type integer
for (i = 0; i < 10; i++) { // Starting a for loop from 0 to 9 (inclusive)
    System.out.println(i); // Printing the value of i to the console
}
```

This code segment demonstrates iteration, as the `for` loop repeats the `System.out.println()` statement 10 times, incrementing the value of `i` with each repetition.