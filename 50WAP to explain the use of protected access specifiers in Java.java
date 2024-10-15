// Superclass
public class Animal {
    // Protected variable
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Protected method
    protected void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
}
// Subclass
public class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Call the constructor of the superclass
    }

    // Method to display information about the dog
    public void showInfo() {
        displayInfo(); // Accessing protected method from superclass
        System.out.println("This is a dog.");
    }
}
// Main class to demonstrate protected access specifier
public class ProtectedAccessSpecifierDemo {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog dog = new Dog("Buddy");

        // Calling method to show information
        dog.showInfo(); // Accessing protected method through subclass
    }
}
