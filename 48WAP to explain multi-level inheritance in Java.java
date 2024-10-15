// Base class
public class Animal {
    // Method to display a general message
    public void eat() {
        System.out.println("This animal eats food.");
    }
}
// Intermediate class that inherits from Animal
public class Dog extends Animal {
    // Method specific to Dog
    public void bark() {
        System.out.println("The dog barks.");
    }
}
    
// Derived class that inherits from Dog
public class Puppy extends Dog {
    // Method specific to Puppy
    public void weep() {
        System.out.println("The puppy weeps.");
    }
}
// Main class to demonstrate multilevel inheritance
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Creating an instance of Puppy
        Puppy puppy = new Puppy();

        // Calling methods from Puppy, Dog, and Animal classes
        puppy.eat();  // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Specific to Puppy
    }
}
