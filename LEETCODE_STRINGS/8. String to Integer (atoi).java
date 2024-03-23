package LEETCODE_STRINGS;

 class MyAtoi {

    public int myAtoi(String str) {
        if (str == null || str.length() == 0) return 0; // Check for empty string

        str = str.trim(); // Remove leading and trailing whitespaces
        if (str.length() == 0) return 0;

        int sign = 1;
        int index = 0;
        long sum = 0; // Use long to handle overflow/underflow

        // Check for sign
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        // Convert number and avoid overflow
        while (index < str.length()) {
            char c = str.charAt(index);
            if (c < '0' || c > '9') break; // Not a digit, stop processing

            sum = sum * 10 + (c - '0');

            // Check for overflow
            if (sign == 1 && sum > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            // Check for underflow
            if (sign == -1 && (-1) * sum < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        return (int) sum * sign;
    }

    public static void main(String[] args) {
        MyAtoi solution = new MyAtoi();

        System.out.println(solution.myAtoi("42")); // Output: 42
        System.out.println(solution.myAtoi("   -42")); // Output: -42
        System.out.println(solution.myAtoi("4193 with words")); // Output: 4193
        System.out.println(solution.myAtoi("words and 987")); // Output: 0
        System.out.println(solution.myAtoi("-91283472332")); // Output: -2147483648 (Integer.MIN_VALUE)
    }
}

