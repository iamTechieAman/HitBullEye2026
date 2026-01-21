package Methods;

class catt {
    String name;
    int age;


    catt() {
        name = "Unknown";
        age = 0;
    }


    catt(String n, int a) {
        name = n;
        age = a;
    }
}

public class cat {
    public static void main(String[] args) {

        catt cat1 = new catt();
        System.out.println("Default Cat: " + cat1.name + ", " + cat1.age);

    }
}