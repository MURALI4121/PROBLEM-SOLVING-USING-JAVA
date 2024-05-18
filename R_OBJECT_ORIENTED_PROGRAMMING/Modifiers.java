package R_OBJECT_ORIENTED_PROGRAMMING;


//Modifiers in java

// Two types
// 1.Access modifiers
// 2.Non Access Modifiers

public class Modifiers {
    //1 Access modifiers
    //1.public : the public modifier is accessible from any other classes
    public int myNumber;

    public void displayNumber() {
        System.out.println(myNumber);
    }

    //2.private : the private modifier is accessible only within the class it is defined
    private int myNumber1;

    private void displayNumber1() {
        System.out.println(myNumber1);
    }

    //3.protected : the protected modifier is accessible within the same package and subclasses
    protected int myNumber2;

    protected void displayNumber2() {
        System.out.println(myNumber2);
    }

    //4.Default(No Modifier) : When no access modifier is specified, it is accessible only within the same package
    int myNumber3;

    void displayNumber3() {
        System.out.println(myNumber);
    }


    //2 Non-Static Modifiers
    //1. Static : the static modifier is used for class level fields and methods
    //            that can be accessed without creating an instance
    public class MyClass {
        public static int myNumber;

        public static void displayNUmber() {
            System.out.println(myNumber);
        }
    }

    //2. Final : the final modifier is used to define constants. when applied to variables they cannot be
    //           changed once initialized. when applied to methods, they cannot be overridden.
    //           when applied to classes, they cannot be subclassed.

    public final class MyClass1{
        public final double pi = 3.14;
        public  void displayNUmber(){
            System.out.println(pi);
        }
    }

    //3.Abstract : The "Abstract" modifier is used to declare abstract classes and methods.
    //              An abstract class cannot be instantiated, ans abstract methods must be implemented by subclasses
    public abstract class MyClass2{
        public abstract void displayNumber();
    }

    //Synchronized : The "Synchronized" modifier is used to control access to a method or block, ensuring
    //               that only one thread can execute it at a time

    public class MyClass3{
        public synchronized void displayNUmber(){
            //thread safe method
        }
    }



}


