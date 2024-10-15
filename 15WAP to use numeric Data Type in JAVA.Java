public class NumericDataTypesDemo {
    public static void main(String[] args) {
        // Integer Data Types
        byte byteValue = 100;                // 1 byte
        short shortValue = 10000;            // 2 bytes
        int intValue = 100000;               // 4 bytes
        long longValue = 100000L;            // 8 bytes (L suffix indicates a long literal)

        // Floating Point Data Types
        float floatValue = 10.5f;            // 4 bytes (f suffix indicates a float literal)
        double doubleValue = 20.99;          // 8 bytes

        // Displaying the values
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
    }
}
