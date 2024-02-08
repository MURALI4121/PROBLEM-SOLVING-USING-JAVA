package B_VARIABLES_AND_DATATYPES;

class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        // Byte - 8-bit integer
        byte myByte = 100;
        System.out.println("Byte Value: " + myByte);

        // Short - 16-bit integer
        short myShort = 5000;
        System.out.println("Short Value: " + myShort);

        // Int - 32-bit integer
        int myInt = 100000;
        System.out.println("Int Value: " + myInt);

        // Long - 64-bit integer
        long myLong = 15000000000L; // Note the 'L' at the end
        System.out.println("Long Value: " + myLong);

        // Float - Single-precision 32-bit IEEE 754 floating point
        float myFloat = 5.99f; // Note the 'f' at the end
        System.out.println("Float Value: " + myFloat);

        // Double - Double-precision 64-bit IEEE 754 floating point
        double myDouble = 19.99;
        System.out.println("Double Value: " + myDouble);

        // Char - A single 16-bit Unicode character
        char myChar = 'A';
        System.out.println("Char Value: " + myChar);

        // Boolean - true or false
        boolean myBoolean = true;
        System.out.println("Boolean Value: " + myBoolean);
    }
}
