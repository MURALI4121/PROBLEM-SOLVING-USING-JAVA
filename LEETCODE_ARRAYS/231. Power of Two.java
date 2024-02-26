package LEETCODE_ARRAYS;
 class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;

        while (n != 1) { // Change the condition to loop until n is not 1
            if (n % 2 != 0) return false; // If n is odd and not 1, it's not a power of two
            n /= 2; // Divide n by 2
        }
        return true; // If the loop exits, n was a power of two
    }

    public static void main(String[] args) {
        PowerOfTwo sol = new PowerOfTwo();

        // Test the method with some values
        System.out.println(sol.isPowerOfTwo(1));  // true
        System.out.println(sol.isPowerOfTwo(16)); // true
        System.out.println(sol.isPowerOfTwo(3));  // false
        System.out.println(sol.isPowerOfTwo(0));  // false
        System.out.println(sol.isPowerOfTwo(-2)); // false
    }
}

