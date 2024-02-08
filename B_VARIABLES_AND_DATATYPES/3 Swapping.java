package B_VARIABLES_AND_DATATYPES;

class Swapping {
    public static void main(String[] args) {

        int a = 25;
        int b = 6;

        // using temporary variable
//        int temp = a;
//        a = b;
//        b = temp;

        //without using temporary variable

        a= a+b;   // a = 25 + 6 = 31  ,now a =31
        b=a-b;    // b = 31-6 = 25  , now b = 25
        a=a-b;    // a = 31-25 = 6 , now a = 6  numbers is sorted

        System.out.println(a);
        System.out.println(b);
    }
}
