package Q_RECURSION_AND_BACKTRACKING;

class ProductOfDigits {
    public static void main(String[] args) {
        int ans = prod(55);
        System.out.println(ans);
    }

    static int prod(int n){
        if(n%10 == n){
            return n;
        }

        return (n%10) * prod(n/10);
    }
}
