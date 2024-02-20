package J_RECURSION_AND_BACKTRACKING;

class PrintNtoOne {
    public static void main(String[] args) {
        int N = 10; // you can give any positive number
        PrintNumber(N);

    }

    public static  void PrintNumber(int n){

        if(n < 1){
            // Base case : When n is less than 1 , stop the recursion
            return;
        }
        System.out.println(n);
        // Recursive call with decremented n
        PrintNumber(n-1);
    }
}
