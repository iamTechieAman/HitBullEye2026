# Bicycle Class Example in Java

This example demonstrates the **basic structure of a class and object creation in Java**. It covers defining a class, declaring fields and methods, creating an object, and accessing class members using that object.

---

## Java Code Example

```java
class Bicycle {

    // field of class
    int gear = 5;

    // method of class
    void braking() {
        // braking logic here
    }
}

// create object
Bicycle sportsBicycle = new Bicycle();

// access field and method
sportsBicycle.gear;
sportsBicycle.braking();
```

---

## Explanation

### 1. Class Definition

The `Bicycle` class represents a blueprint for creating bicycle objects.

* `gear` is an **instance variable** that stores the gear value of the bicycle.
* `braking()` is an **instance method** that defines the behavior of braking.

### 2. Object Creation

```java
Bicycle sportsBicycle = new Bicycle();
```

Here, a new object named `sportsBicycle` is created using the `new` keyword. This object gets its own copy of all instance variables and methods of the class.

### 3. Accessing Class Members

* `sportsBicycle.gear` accesses the value of the `gear` variable.
* `sportsBicycle.braking()` calls the `braking()` method.

Both fields and methods are accessed using the **dot (`.`) operator**.

---

## Key Points

* A **class** is a blueprint; an **object** is its real-world instance.
* Instance variables and methods belong to objects, not directly to the class.
* The `new` keyword allocates memory for the object at runtime.

This is a foundational concept in **Object-Oriented Programming (OOP)** and is essential for understanding how Java programs are structured.


# Car Class with Constructor Example in Java

This example demonstrates how to use **encapsulation and parameterized constructors** in Java. It shows how object data is initialized at the time of creation and how class methods are used to display object information.

---

## Java Code Example

```java
class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brandtype, String modeltype, int yearnew) {
        brand = brandtype;
        model = modeltype;
        year = yearnew;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year:" + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Ford", "Mustang", 2019);

        car1.displayInfo();
        car2.displayInfo();
    }
}
```

---

## Explanation

### 1. Encapsulation Using `private` Fields

The instance variables `brand`, `model`, and `year` are declared as `private`. This ensures that the data cannot be accessed directly from outside the class, maintaining data security.

### 2. Parameterized Constructor

```java
public Car(String brandtype, String modeltype, int yearnew)
```

The constructor initializes the object’s state at the time of object creation. Each `Car` object can store different values for brand, model, and year.

### 3. Object Creation

```java
Car car1 = new Car("Toyota", "Corolla", 2020);
Car car2 = new Car("Ford", "Mustang", 2019);
```

Here, two different `Car` objects are created using the same class but with different data.

### 4. Method Invocation

```java
car1.displayInfo();
car2.displayInfo();
```

The `displayInfo()` method prints the details of each car object.

---

## Key Takeaways

* **Constructors** are used to initialize objects.
* **Encapsulation** protects class data using access modifiers.
* Multiple objects can be created from the same class with different values.

This pattern is commonly used in real-world Java applications to model entities such as cars, students, employees, and more.


# Object Creation Example in Java

This example explains **how objects are created from a class in Java** and how multiple objects can be created from the same class.

---

## General Syntax for Object Creation

```java
className object = new className();
```

* `className` represents the name of the class.
* `object` is the reference variable that points to the object.
* The `new` keyword allocates memory and creates the object.

---

## Example Using the `Bicycle` Class

```java
Bicycle sportsBicycle = new Bicycle();
Bicycle touringBicycle = new Bicycle();
```

In this example:

* `sportsBicycle` and `touringBicycle` are **two different objects**.
* Both objects are created from the same `Bicycle` class.
* Each object has its own separate copy of instance variables.

---

## Important Points

* A **class** is a blueprint; an **object** is an instance of that blueprint.
* Multiple objects can be created from a single class.
* Changes made to one object do not affect another object unless references are shared.

This concept is fundamental to **Object-Oriented Programming (OOP)** in Java and is widely used in real-world applications.