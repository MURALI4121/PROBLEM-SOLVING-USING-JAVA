package O_BIT_MANIPULATION;

class oddEven {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
