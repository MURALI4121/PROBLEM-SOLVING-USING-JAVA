package J_BASIC_RECURSION;

class RecursionExample1 {
    public static void main(String[] args) {
        //
        //write a function that prints hello world
        message();
    }

    public static void message() {
        System.out.println("Hello World");
        message1();
    }

    public static void message1() {
        System.out.println("Hello World");
        message2();
    }

    public static void message2() {
        System.out.println("Hello World");
        message3();
    }

    public static void message3() {
        System.out.println("Hello World");
        message4();
    }

    public static void message4() {
        System.out.println("Hello World");
    }


}
