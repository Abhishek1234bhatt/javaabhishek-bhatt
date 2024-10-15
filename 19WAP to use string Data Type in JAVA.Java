public class StringDataTypeDemo {
    public static void main(String[] args) {
        // Declare and initialize String variables
        String greeting = "Hello, World!";  // A simple string
        String name = "Alice";               // A string representing a name

        // Displaying the values of the String variables
        System.out.println("Greeting: " + greeting);
        System.out.println("Name: " + name);

        // String length
        System.out.println("Length of greeting: " + greeting.length());

        // String concatenation
        String fullGreeting = greeting + " My name is " + name + ".";
        System.out.println("Full Greeting: " + fullGreeting);

        // Accessing characters in a string
        char firstChar = greeting.charAt(0); // Accessing the first character
        System.out.println("First character of greeting: " + firstChar);

        // Substring
        String subString = greeting.substring(7, 12); // Extracting "World"
        System.out.println("Substring (7 to 12): " + subString);

        // String comparison
        if (name.equals("Alice")) {
            System.out.println("The name is Alice.");
        } else {
            System.out.println("The name is not Alice.");
        }

        // Converting to uppercase
        String upperCaseGreeting = greeting.toUpperCase();
        System.out.println("Uppercase Greeting: " + upperCaseGreeting);
    }
}
