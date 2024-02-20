package J_RECURSION_AND_BACKTRACKING;

class RecursionNumbersExample {
//
//    public static void main(String[] args) {
//        //Write a function that takes in a number and prints it
//        //print first 5 numbers : 1 2 3 4 5
//        print1(1);
//    }
//
//    public static void print1(int n){
//        System.out.println(n);
//        print2(2);
//
//    }
//    public static void print2(int n){
//        System.out.println(n);
//        print3(3);
//    }
//    public static void print3(int n){
//        System.out.println(n);
//        print4(4);
//    }
//    public static void print4(int n){
//        System.out.println(n);
//        print5(5);
//    }
//    public static void print5(int n){
//        System.out.println(n);
//    }


    // we can write the above code in a simple way like this

    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        // print first 5 numbers :1 2 3 4 5

        print(1);

    }
    public static void print(int n){
        // base condition
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //recursive call
        //if you are calling a function again and again, you can treat it as a  seperate call in the stack
        print(n + 1);
    }
}
