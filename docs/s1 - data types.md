# Overview of Java Data Types

Java has several different data types that can be used to declare variables. These data types fall into two categories: primitive data types and reference data types.

The website [CodeHS](https://codehs.com/) offers free IDE for you to play around and learn java from scratch. 

## Primitive Data Types

Primitive data types are the simplest form of data types in Java. They represent basic values like integers, decimals, characters, and booleans. There are eight primitive data types in Java:

### 1. byte

The `byte` data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).

```java
byte myByte = 100;
```

### 2. short

The `short` data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).

```java
short myShort = 5000;
```

### 3. int

The `int` data type is a 32-bit signed two's complement integer. It has a minimum value of -2<sup>31</sup> and a maximum value of 2<sup>31</sup>-1.

```java
int myInt = 100000;
```

### 4. long

The `long` data type is a 64-bit signed two's complement integer. It has a minimum value of -2<sup>63</sup> and a maximum value of 2<sup>63</sup>-1.

```java
long myLong = 10000000000L;
```

Note: The letter "L" at the end of the number tells the compiler that this is a `long` data type.

### 5. float

The `float` data type is a single-precision 32-bit IEEE 754 floating point. It should never be used for precise values such as currency.

```java
float myFloat = 3.14F;
```

Note: The letter "F" at the end of the number tells the compiler that this is a `float` data type.

### 6. double

The `double` data type is a double-precision 64-bit IEEE 754 floating point. It should be used for decimal values when precision is required.

```java
double myDouble = 3.141592653589793238;
```

### 7. boolean

The `boolean` data type represents one bit of information, either true or false.

```java
boolean myBoolean = true;
```

### 8. char

The `char` data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535).

```java
char myChar = 'A';
```

## Reference Data Types

Reference data types are more complex data types in Java. They represent objects and arrays, and they must be initialized with the `new` keyword. One example of a reference data type is the `String` class.

### 9. String

The `String` class represents a sequence of characters. It is used to store text in Java programs.

```java
String myString = "Hello, world!";
```

And that's it! With these different data types, you can now start declaring variables in your Java programs.

### Summary

Here's the table with two different columns for size: 

| Data Type | Size (bits) | Size (bytes)| Primitive/Reference | Allowed Values                                                |
| --------- | ----------- | ----------- | -------------------| -------------------------------------------------------------|
| byte      | 8           | 1           | Primitive          | -128 to 127 (inclusive)                                       |
| short     | 16          | 2           | Primitive          | -32,768 to 32,767 (inclusive)                                 |
| int       | 32          | 4           | Primitive          | -2<sup>31</sup> to 2<sup>31</sup>-1                            |
| long      | 64          | 8           | Primitive          | -2<sup>63</sup> to 2<sup>63</sup>-1                            |
| float     | 32          | 4           | Primitive          | Approximately ±3.40282347E+38F (6-7 significant decimal digits)|
| double    | 64          | 8           | Primitive          | Approximately ±1.79769313486231570E+308 (15 significant digits)|
| boolean   | 1           | 1/8         | Primitive          | true or false                                                 |
| char      | 16          | 2           | Primitive          | '\u0000' (or 0) to '\uffff' (or 65,535)                       |
| String    | n/a         | n/a         | Reference          | Any sequence of characters                                     |

