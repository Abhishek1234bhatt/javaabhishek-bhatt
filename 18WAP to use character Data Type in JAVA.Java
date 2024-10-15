public class CharacterDataTypeDemo {
    public static void main(String[] args) {
        // Declare and initialize char variables
        char initial = 'A';                 // A single character
        char digit = '5';                   // A character representing a digit
        char specialChar = '@';             // A special character

        // Displaying the values of the char variables
        System.out.println("Initial: " + initial);
        System.out.println("Digit: " + digit);
        System.out.println("Special Character: " + specialChar);

        // Using char variables in conditional statements
        if (initial == 'A') {
            System.out.println("The initial is A.");
        } else {
            System.out.println("The initial is not A.");
        }

        // Checking if the character is a digit
        if (digit >= '0' && digit <= '9') {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is not a digit.");
        }

        // Checking if the character is a special character
        if (specialChar == '@') {
            System.out.println("The character is a special character.");
        } else {
            System.out.println("The character is not a special character.");
        }
    }
}
