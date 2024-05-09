package Q_RECURSION_AND_BACKTRACKING;

//Program to print 1 to N and N to 1
class RecursionExample3 {

    public static void main(String[] args) {
        FunctionRev(5);
    }

    static void FunctionRev(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        FunctionRev(n-1);
        System.out.println(n);


    }
}
