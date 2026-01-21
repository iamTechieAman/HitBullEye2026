# Simple Car Class Example in Java

This example shows a **basic Java class with instance variables, a method, and object creation inside the `main` method**. It demonstrates how class members are accessed using an object.

---

## Java Code Example

```java
class Car {
    String brand = "Toyoto";
    int year = 2023;

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.displayInfo();
    }
}
```

---

## Explanation

### 1. Instance Variables

* `brand` and `year` are **instance variables**.
* They store the state of each `Car` object.
* Default values are assigned directly at declaration.

### 2. Method Definition

```java
public void displayInfo()
```

This method prints the details of the car using the instance variables.

### 3. Object Creation Inside `main`

```java
Car mycar = new Car();
```

An object named `mycar` is created using the `Car` class.

### 4. Method Call

```java
mycar.displayInfo();
```


---

## Key Concepts Covered

* Class and object creation
* Instance variables
* Method definition and invocation
* Program execution using `main` method


# Static Method with Parameters Example in Java

This example demonstrates how to define and use a **static method with parameters** in Java. It shows how a method can be called multiple times with different arguments.

---

## Java Code Example

```java
public class Main {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Sneha", 25);
        myMethod("Sanjana", 21);
        myMethod("Anju", 20);
    }
}
```

---

## Explanation

### 1. Static Method Definition

```java
static void myMethod(String fname, int age)
```

* The method `myMethod` is declared as `static`, so it belongs to the class rather than to an object.
* It accepts two parameters: a `String` (`fname`) and an `int` (`age`).

### 2. Method Call from `main`

```java
myMethod("Sneha", 25);
```

Since both `main` and `myMethod` are static, the method can be called directly without creating an object.

### 3. Passing Arguments

Each time `myMethod` is called, different values are passed as arguments. The method uses these values to print a formatted message.

---

## Key Points

* **Static methods** can be called without creating an object.
* **Parameters** allow methods to receive data from the caller.
* The same method can be reused with different values.

This approach improves **code reusability** and keeps programs clean and easy to maintain.

# Method Syntax and Method Call in Java

This section explains the **general structure of a method in Java** and how a method is called. Understanding this syntax is essential for writing reusable and well-organized programs.

---

## General Method Syntax

```java
accessModifier nonAccessModifier returnType methodName(Parameters) {
    statements;
    statements;
    statements;
}
```

### Explanation of Each Part

* **accessModifier**: Controls visibility of the method (e.g., `public`, `private`, `protected`).
* **nonAccessModifier**: Provides additional behavior (e.g., `static`, `final`, `abstract`).
* **returnType**: Specifies what type of value the method returns. Use `void` if nothing is returned.
* **methodName**: Name of the method, written using camelCase.
* **Parameters**: Input values passed to the method (optional).
* **statements**: Instructions executed when the method is called.

---

## Method with No Return Value (`void`)

```java
public static void displayMessage(String message) {
    System.out.println(message);
}
```

In this example, the method performs an action but does not return any value.

---

## Calling a Method

```java
displayMessage("Hello World");
```

### Key Points About Method Calls

* The method name must match exactly.
* The number and type of values must match the parameters.
* If the method is `static`, it can be called directly.
* If the method is non-static, an object is required.

---

## Important Notes

* Methods help reduce code repetition.
* A method can be called multiple times with different values.
* Clear method names improve readability and maintainability.

This structure is commonly used in real-world Java programs to organize logic into reusable blocks.

# Constructor Using `this` Keyword in Java

This example demonstrates how to use a **parameterized constructor** along with the **`this` keyword** to initialize instance variables in Java.

---

## Java Code Example

```java
class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020);
        myCar.displayInfo();
    }
}
```

---

## Explanation

### 1. Instance Variables

* `brand` and `year` are instance variables of the `Car` class.
* They represent the state of each `Car` object.

### 2. Parameterized Constructor

```java
public Car(String brand, int year)
```

The constructor receives values when the object is created.

### 3. Use of `this` Keyword

```java
this.brand = brand;
this.year = year;
```

* `this` refers to the **current object**.
* It differentiates instance variables from constructor parameters with the same name.

### 4. Object Creation and Method Call

```java
Car myCar = new Car("Toyota", 2020);
myCar.displayInfo();
```

An object is created using the constructor, and its details are displayed using a method call.

---

## Key Concepts Covered

* Parameterized constructor
* `this` keyword
* Object creation
* Method invocation

This pattern is widely used in Java to write clear, maintainable, and readable object-oriented code.

# Default Constructor and Methods Example in Java

This example demonstrates the use of a **default constructor**, **private instance variables**, and **methods to modify object state** in Java. It shows how an object’s data can be initialized and updated through method calls.

---

## Java Code Example

```java
class Bicycle {
    private int gear;
    private int speed;

    public Bicycle() {
        gear = 1;
        speed = 0;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void displayStatus() {
        System.out.println("Gear: " + gear + ", Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle();
        myBike.speedUp(15);
        myBike.displayStatus();
    }
}
```

---

## Explanation

### 1. Private Instance Variables

* `gear` and `speed` are declared as `private`.
* This ensures the variables cannot be accessed directly from outside the class.

### 2. Default Constructor

```java
public Bicycle()
```

* The constructor is called automatically when a `Bicycle` object is created.
* It initializes the bicycle with a default gear and speed.

### 3. Methods to Update State

* `speedUp(int increment)` increases the speed.
* `applyBrake(int decrement)` decreases the speed.

These methods control how the object’s data changes.

### 4. Displaying Object State

```java
myBike.displayStatus();
```

This method prints the current gear and speed of the bicycle.

---

## Key Concepts Covered

* Default constructor
* Encapsulation using `private`
* Updating object state using methods
* Object creation and method invocation

This example reflects a common real-world scenario where object behavior controls how data is modified.

# String Length and Character Array Example in Java

This example demonstrates **basic String operations in Java**, including finding the length of a string, converting a string to a character array, and accessing individual characters.

---

## Java Code Example

```java
public class Main {
    public static void main(String[] args) {
        String targetString = "Java is fun to learn";
        String str1 = "JAVA";
        String str2 = "Java";
        String str3 = "  Hello Java  ";

        System.out.println("Checking Length: " + targetString.length());

        char[] charArray = str2.toCharArray();
        System.out.println("Size of char array: " + charArray.length);

        System.out.println("Printing last element of array: " +
                charArray[charArray.length - 1]);
    }
}
```

---

## Explanation

### 1. Finding String Length

```java
targetString.length();
```

The `length()` method returns the total number of characters present in the string, including spaces.

### 2. Converting String to Character Array

```java
char[] charArray = str2.toCharArray();
```

* The `toCharArray()` method converts a string into an array of characters.
* Each character of the string is stored as an element in the array.

### 3. Length of Character Array

```java
charArray.length
```

This gives the number of characters present in the array.

### 4. Accessing the Last Character

```java
charArray[charArray.length - 1]
```

* Arrays in Java are zero-indexed.
* `length - 1` points to the last valid index of the array.

---

## Key Concepts Covered

* String length using `length()`
* Conversion of String to `char[]`
* Difference between `length()` (String) and `length` (array)
* Accessing array elements using index
