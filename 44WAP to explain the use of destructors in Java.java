class Demo {
    // Constructor
    public Demo() {
        System.out.println("Object created.");
    }

    // Overriding finalize method
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalize method called. Cleaning up resources...");
            // Cleanup code can go here (e.g., closing connections)
        } finally {
            super.finalize(); // Call the superclass's finalize method
        }
    }
}

public class DestructorDemo {
    public static void main(String[] args) {
        // Create an instance of Demo
        Demo demo = new Demo();

        // Make the demo object eligible for garbage collection
        demo = null;

        // Requesting garbage collection
        System.gc(); // Suggests that the Java Virtual Machine (JVM) should perform garbage collection

        // Adding a delay to ensure the finalize method is called
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
s