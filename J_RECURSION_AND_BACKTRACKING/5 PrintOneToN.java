package J_RECURSION_AND_BACKTRACKING;

class PrintOneToN {
    public static void main(String[] args) {

        int N = 20;
        PrintNumbers(1,N);
    }

    public static void PrintNumbers(int one,int N){

        //Base Case: When Start is greater than N, Stop the recursion
        if (one > N){
            return;
        }
        System.out.println(one);
        //Recursive call with incremented Start
        PrintNumbers(one + 1, N);
    }
}
