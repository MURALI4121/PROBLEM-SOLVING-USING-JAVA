package Q_RECURSION_AND_BACKTRACKING;


//Sum of numbers
class Sum {

    public static void main(String[] args) {
        int ans = Sum(5);
        System.out.println(ans);
    }

    static int Sum (int n){
        if(n <= 1){
            return 1;
        }

        return n + Sum(n-1);
    }


}
