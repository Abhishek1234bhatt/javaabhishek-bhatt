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
