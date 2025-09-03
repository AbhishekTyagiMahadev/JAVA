class Student {
    String name;
    int age;

    // Perameterised Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Abhishek Tyagi", 22);
        s1.printInfo();
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}