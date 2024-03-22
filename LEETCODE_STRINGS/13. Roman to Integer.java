package LEETCODE_STRINGS;

 class RomanToInteger {
    public static int romanToInt(String s) {
        int sum = 0; // Initialize sum of the numerals

        // Convert the Roman numeral to integer
        for (int i = 0; i < s.length(); i++) {
            // Add the value of the current Roman numeral to the sum
            int val = value(s.charAt(i));

            // If the current numeral is followed by a larger-valued numeral, subtract twice the value of the current numeral
            if (i + 1 < s.length() && val < value(s.charAt(i + 1))) {
                sum -= val;
            } else {
                sum += val;
            }
        }

        return sum;
    }

    // Method to map each Roman symbol to its integer value
    public static int value(char r) {
        switch(r) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // Output: 3
        System.out.println(romanToInt("LVIII")); // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }
}

