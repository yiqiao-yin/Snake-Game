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