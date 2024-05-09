package Q_RECURSION_AND_BACKTRACKING;


//Program to print sum of digits
class RecursionExample2 {

    public static void main(String[] args) {
        FunctionRev(5);
    }

    static void FunctionRev(int n){
        if(n == 0){
            return;
        }
        FunctionRev(n-1);
        System.out.println(n);


    }
}
