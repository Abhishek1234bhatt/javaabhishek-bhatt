public class ConstantsDemo {
    
    // Defining constants
    public static final double PI = 3.14159;  // Constant for the value of Pi
    public static final int MAX_USERS = 100;   // Constant for maximum users
    public static final String APP_NAME = "My Java Application";  // Constant for application name

    public static void main(String[] args) {
        // Displaying the constants
        System.out.println("Application Name: " + APP_NAME);
        System.out.println("Value of Pi: " + PI);
        System.out.println("Maximum Users Allowed: " + MAX_USERS);

        // Attempting to change the constant (this will cause a compilation error)
        // PI = 3.14;  // Uncommenting this line will result in an error
    }
}
