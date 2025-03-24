// Program using this pointer
class Student {
    // Instance variables
    private String name;
    private int age;

    // Constructor with parameters having the same names as instance variables
    public Student(String name, int age) {
        this.name = name; // this.name refers to the instance variable, name refers to the parameter
        this.age = age;   // this.age refers to the instance variable, age refers to the parameter
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ThisPointer {
    public static void main(String[] args) {
        // Create a new Student object
        Student student = new Student("Jayanvi Tyagi Maam", 25);
        
        // Display the details of the student
        student.displayDetails();
    }
}
