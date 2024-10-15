// Class demonstrating the use of private access specifier
public class PrivateAccessSpecifierDemo {
    // Private variable
    private String secret = "This is a private secret!";

    // Public method to access the private variable
    public String getSecret() {
        return secret;
    }

    // Public method to modify the private variable
    public void setSecret(String newSecret) {
        secret = newSecret;
    }

    // Private method (not accessible outside this class)
    private void displaySecret() {
        System.out.println("Secret: " + secret);
    }

    // Public method to demonstrate the private method
    public void showSecret() {
        displaySecret();
    }
}

// Testing the PrivateAccessSpecifierDemo class
public class AccessSpecifierTest {
    public static void main(String[] args) {
        // Create an instance of PrivateAccessSpecifierDemo
        PrivateAccessSpecifierDemo demo = new PrivateAccessSpecifierDemo();
        
        // Accessing private variable directly will cause an error
        // System.out.println(demo.secret); // This line would cause a compile-time error

        // Using public methods to access and modify the private variable
        System.out.println("Initial secret: " + demo.getSecret());

        // Modifying the private variable
        demo.setSecret("New private secret!");
        System.out.println("Updated secret: " + demo.getSecret());

        // Demonstrating private method indirectly
        demo.showSecret();
    }
}
