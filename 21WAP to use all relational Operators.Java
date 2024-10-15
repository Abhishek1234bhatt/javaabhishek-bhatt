import java.util.Scanner;

public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Using relational operators
        System.out.println("Using Relational Operators:");
        System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));        // Equal to
        System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));        // Not equal to
        System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));          // Greater than
        System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));          // Less than
        System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));        // Greater than or equal to
        System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));        // Less than or equal to

        // Closing the scanner
        scanner.close();
    }
}
