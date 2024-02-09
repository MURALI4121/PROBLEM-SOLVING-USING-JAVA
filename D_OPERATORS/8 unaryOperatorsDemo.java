package D_OPERATORS;

class unaryOperatorsDemo {

    public static void main(String[] args) {

        //unary minus
        int a = 5;
        System.out.println("Original value of a: " + a);
        a = -a; // apply unary minus
        System.out.println("After applying unary minus : " + a);

        //increment
        int b = 5;
        System.out.println("Original value of b:" + b);
        b++;//post incrment
        System.out.println("After post-increment " + b);
        ++b; // pre increment
        System.out.println("After pre-increment" + b);

        //Decrement
        int c = 5;
        System.out.println("Original value of b:" + c);
        c--;//post incrment
        System.out.println("After post-increment " + c);
        --c; // pre increment
        System.out.println("After pre-increment" + c);

        //Conceptual demonstration of logical NOT (!) with integers
        //Note : In java, logical NOT cannot be directly applied to integers
        boolean isNonZero = (5 != 0);//treating 5 as "true" because its non zero
        isNonZero = !isNonZero; // applying logical NOT
        System.out.println("is 5 non-Zero(after Not : " + isNonZero);

        //Bitwise NOT
        int d = 5;
        System.out.println("Original value of d: " + d);
        d = ~d; //apply bitwise NOT
        System.out.println("After applying bitwise NOT : " + d);
    }

}
