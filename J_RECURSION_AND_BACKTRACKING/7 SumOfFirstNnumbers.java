package J_RECURSION_AND_BACKTRACKING;

class SumOfFirstNnumbers {
    public static void main(String[] args) {
        int N = 10;
        System.out.println(Sum(N));
    }

    public static int Sum( int n){

        // Base case : if n is 0 or negative , return 0
        if(n <= 0){
            return 0;
        }
        //Recursion Step : Sum of n is n + sum of n-1
        return n + Sum(n-1);
    }
}
