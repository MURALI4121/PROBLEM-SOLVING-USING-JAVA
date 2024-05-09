package Q_RECURSION_AND_BACKTRACKING;



//program to to print N to 1

class RecursionExample1 {

    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        fun(n - 1);
    }


}