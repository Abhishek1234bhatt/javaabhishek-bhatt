// Final class
final class FinalClass {
    // Final variable
    public static final String CONSTANT_MESSAGE = "This is a constant message.";

    // Final method
    public final void displayMessage() {
        System.out.println(CONSTANT_MESSAGE);
    }
}

// Attempting to inherit from FinalClass will cause an error
// class SubClass extends FinalClass { 
//     // This will result in a compilation error
// }

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Using final variable
        System.out.println(FinalClass.CONSTANT_MESSAGE);

        // Creating an object of FinalClass
        FinalClass finalObj = new FinalClass();
        
        // Calling the final method
        finalObj.displayMessage();
        
        // Demonstrating final variable
        final int localFinalVariable = 10;
        System.out.println("Local final variable: " + localFinalVariable);
        
        // Attempting to change the final variable will cause an error
        // localFinalVariable = 20; // Uncommenting this line will cause a compilation error
    }
}
