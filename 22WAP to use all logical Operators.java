import java.util.Scanner;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two boolean values
        System.out.print("Enter first boolean value (true/false): ");
        boolean value1 = scanner.nextBoolean();
        System.out.print("Enter second boolean value (true/false): ");
        boolean value2 = scanner.nextBoolean();

        // Using logical operators
        System.out.println("Using Logical Operators:");
        System.out.println(value1 + " && " + value2 + " : " + (value1 && value2)); // Logical AND
        System.out.println(value1 + " || " + value2 + " : " + (value1 || value2)); // Logical OR
        System.out.println("! " + value1 + " : " + (!value1));                       // Logical NOT
        System.out.println("! " + value2 + " : " + (!value2));                       // Logical NOT

        // Closing the scanner
        scanner.close();
    }
}
