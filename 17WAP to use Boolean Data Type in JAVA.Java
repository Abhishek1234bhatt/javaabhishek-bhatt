public class BooleanDataTypeDemo {
    public static void main(String[] args) {
        // Declare and initialize boolean variables
        boolean isJavaFun = true;         // Represents if learning Java is fun
        boolean isFishTasty = false;      // Represents if fish is tasty

        // Display the values of the boolean variables
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

        // Using boolean variables in conditional statements
        if (isJavaFun) {
            System.out.println("Yes, Java is fun!");
        } else {
            System.out.println("No, Java is not fun.");
        }

        if (isFishTasty) {
            System.out.println("Yes, fish is tasty!");
        } else {
            System.out.println("No, fish is not tasty.");
        }
    }
}
