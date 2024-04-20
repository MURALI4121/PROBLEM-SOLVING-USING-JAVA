package J_BASIC_RECURSION;

class RecursionFibonacciExample {
    public static void main(String[] args) {
        System.out.println(fibonacci(7  ));
    }

    public static int fibonacci(int n){
        //base case
        if (n<2){
            return n;
        }

        // recursive call
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
