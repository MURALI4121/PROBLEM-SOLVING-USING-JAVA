package J_RECURSION_AND_BACKTRACKING;

class SumOfDigits {
    public static void main(String[] args) {
        int sum = Sum(1432);
        System.out.println(sum);

    }

    public static int Sum(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + Sum(n/10);
    }
}
