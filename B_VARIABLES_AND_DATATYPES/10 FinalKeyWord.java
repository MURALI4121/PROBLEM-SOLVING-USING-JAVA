package B_VARIABLES_AND_DATATYPES;

class FinalKeyWord {
    public static void main(String[] args) {

        //Declare a final variable and initialize it
        final int number = 15;

        System.out.println("The value of final variable is " + number);

        //Attempting to change the value of final variable will cause a compilation error
        // number = 16 if you try to assign or change the value will result a compilation error

        System.out.println("Attempting to change final number will result in a compilation error");
    }

}
