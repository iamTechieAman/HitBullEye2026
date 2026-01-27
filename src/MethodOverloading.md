# Method Overloading Example Using Static Methods in Java

This example demonstrates **method overloading** in Java using **static methods** with different parameter data types. It shows how Java selects the appropriate method based on the type of arguments passed.

---

## Java Code Example

```java
class CourseOverload {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int a = 6, b = 90;
        double c = 12.12, d = 23.12;

        System.out.println(add(a, b));
        System.out.println(add(c, d));
    }
}
```

---

## Explanation

### 1. Method Overloading

Both methods are named `add`, but they differ in **parameter data types**:

```java
add(int num1, int num2)
add(double num1, double num2)
```

This allows the same operation (addition) to be performed on different types of data.

### 2. Static Methods

* The `add` methods are declared as `static`.
* Static methods belong to the class, not to objects.
* They can be called directly from the `main` method without creating an object.

### 3. Method Calls

```java
add(a, b);   // calls int version
add(c, d);   // calls double version
```

Java determines which method to execute at **compile time** based on the argument types.

---

## Key Concepts Covered

* Method overloading with different data types
* Use of static methods
* Compile-time polymorphism
* Code reuse and readability

This approach keeps code clean while allowing similar logic to work with multiple data types.

# Method Overriding Example in Java

This example demonstrates **method overriding** in Java and shows how **runtime polymorphism** works when a parent class reference points to a child class object.

---

## Java Code Example

```java
class Shape {
    void draw() {
        System.out.println("Inside the method of Parent class ");
        System.out.println("Drawing Shapes");
    }
}

// Derived class
class Circle extends Shape {
    // Overriding method of base class with different implementation
    @Override
    void draw() {
        System.out.println("Inside the overridden method of the child class ");
        System.out.println("Drawing Circle");
    }
}

public class MethodOverridingDemo {
    public static void main(String args[]) {
        Shape obj = new Shape();
        obj.draw();

        Shape obj1 = new Circle();
        obj1.draw();
    }
}
```

---

## Explanation

### 1. Parent Class (`Shape`)

The `Shape` class defines a method `draw()` that provides a general implementation for drawing shapes.

### 2. Child Class (`Circle`)

The `Circle` class extends `Shape` and **overrides** the `draw()` method:

* The method name, return type, and parameters remain the same.
* The implementation is different and specific to `Circle`.
* The `@Override` annotation ensures the method is correctly overridden.

### 3. Method Calls and Runtime Behavior

```java
Shape obj = new Shape();
obj.draw();
```

Calls the `draw()` method of the `Shape` class.

```java
Shape obj1 = new Circle();
obj1.draw();
```

Although the reference type is `Shape`, the **child class method** is executed at runtime. This behavior is known as **runtime polymorphism**.

---

## Key Concepts Covered

* Method overriding
* Inheritance
* Runtime polymorphism
* Use of `@Override` annotation
* Parent reference pointing to child object

Method overriding allows child classes to provide their own specific behavior while maintaining a common interface defined by the parent class.

# Method Overriding in Multilevel Inheritance Example in Java

This example demonstrates **method overriding across multiple levels of inheritance** in Java. It shows how the same method behaves differently depending on the class implementation and the object created.

---

## Java Code Example

```java
class Car {
    void fuel() {
        System.out.println("Can have diesel or petrol as the fuel");
    }
}

class Sedan extends Car {
    @Override
    void fuel() {
        System.out.println("Shiny Car, but runs on diesel.");
    }
}

class Engine extends Sedan {
    @Override
    void fuel() {
        System.out.println("Converting diesel to smooth motion!");
    }

    public static void main(String args[]) {
        Engine e = new Engine();
        e.fuel();
    }
}
```

---

## Explanation

### 1. Base Class (`Car`)

The `Car` class defines a general version of the `fuel()` method describing fuel options.

### 2. Intermediate Class (`Sedan`)

The `Sedan` class extends `Car` and **overrides** the `fuel()` method with a more specific implementation.

### 3. Derived Class (`Engine`)

The `Engine` class extends `Sedan` and again **overrides** the `fuel()` method with its own behavior.

This creates a **multilevel inheritance hierarchy**:

```
Car → Sedan → Engine
```

### 4. Method Call Resolution

```java
Engine e = new Engine();
e.fuel();
```

The method call executes the **most specific overridden version**, which is the one defined in the `Engine` class.

---

## Key Concepts Covered

* Multilevel inheritance
* Method overriding at multiple
