package J_BASIC_RECURSION;

class FactorialUsingRecursion {
    public static void main(String[] args) {
        int N = 3 ;
        System.out.println(factorial(N));
    }

    public static int factorial(int n){

        // Base case
        if ( n <= 0){
            return 1;
        }
        //Recursive case
        return n * factorial(n-1);
    }
}
