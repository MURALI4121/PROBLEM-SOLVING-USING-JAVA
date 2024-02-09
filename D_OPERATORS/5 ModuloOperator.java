package D_OPERATORS;

class ModuloOperator {

    public static void main(String[] args) {
        int number = 15;

        // If the remainder is 0 when divided by 2, it's even
        if(number % 2 == 0){
            System.out.println("the given number is even");
        }else {
            // Otherwise, it's odd
            System.out.println("the number is odd");
        }
    }
}
