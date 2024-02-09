package D_OPERATORS;

class StringComparison {
    public static void main(String[] args) {

        //String literals - interned Strings
        String str1 = "murali";
        String str2 = "murali";

        //String objects
        String str3 = new String("murali");
        String str4 = new String("murali");

        //Compare using ==
        System.out.println(str1 == str2);//true, because they are interned strings
        System.out.println(str3 == str4);//False, because they are diff objects that stored in heap memory

        //Comapre using equals()
        System.out.println(str1.equals(str2));// true, contents same
        System.out.println(str1.equals(str2));//true , contents same

        //compare str1 with str3
        System.out.println(str1 == str3); // false str1 is interned string and str3 is new object
        System.out.println(str1.equals(str3));// True, contents are the same


// == is used for reference comparison (address comparison) and checks if two references point to the same object.
// .equals() method is used for content comparison in objects and should be used when checking if two strings have the same value.
// The string pool in Java is a special memory region where string literals are stored to optimize memory usage by reusing immutable strings.
    }
}
