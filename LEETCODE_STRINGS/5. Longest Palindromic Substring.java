package LEETCODE_STRINGS;

class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
                    longestPalindrome = substring;
                }
            }
        }
        return longestPalindrome;
    }

    private static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        String s1 = "babad";
        System.out.println(lp.longestPalindrome(s1)); // Example output: "bab" or "aba"

        String s2 = "cbbd";
        System.out.println(lp.longestPalindrome(s2)); // Example output: "bb"
    }
}

