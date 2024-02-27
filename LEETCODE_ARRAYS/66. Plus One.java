package LEETCODE_ARRAYS;

class PlusOne {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }

            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }

        public static void main(String[] args) {
            PlusOne plus = new PlusOne();

            // Test case 1
            int[] digits1 = {1, 2, 3};
            digits1 = plus.plusOne(digits1);
            System.out.println(java.util.Arrays.toString(digits1)); // Expected output: [1, 2, 4]

            // Test case 2
            int[] digits2 = {4, 3, 2, 1};
            digits2 = plus.plusOne(digits2);
            System.out.println(java.util.Arrays.toString(digits2)); // Expected output: [4, 3, 2, 2]

            // Test case 3
            int[] digits3 = {9, 9, 9};
            digits3 = plus.plusOne(digits3);
            System.out.println(java.util.Arrays.toString(digits3)); // Expected output: [1, 0, 0, 0]
        }
    }

