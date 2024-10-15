// Class implementing both Animal and Pet interfaces
public class Dog implements Animal, Pet {
    // Implementing the eat method from Animal interface
    @Override
    public void eat() {
        System.out.println("The dog eats dog food.");
    }

    // Implementing the play method from Pet interface
    @Override
    public void play() {
        System.out.println("The dog plays fetch.");
    }

    // Additional method specific to Dog class
    public void bark() {
        System.out.println("The dog barks.");
    }
}
// Main class to demonstrate multiple inheritance using interfaces
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog dog = new Dog();

        // Calling methods from Animal and Pet interfaces
        dog.eat();  // From Animal interface
        dog.play(); // From Pet interface
        dog.bark(); // Specific to Dog class
    }
}
