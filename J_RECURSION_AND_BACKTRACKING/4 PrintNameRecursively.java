package J_RECURSION_AND_BACKTRACKING;

class PrintNameRecursively {
    public static void main(String[] args) {
        Name("murali", 5);

    }

    public static void Name(String name, int n) {

        //base case
        if (n == 0) {
            return;
        }
        // print the Name
        System.out.println(name);

        //Recursive call with n-1
        Name(name, n - 1);

    }
}
