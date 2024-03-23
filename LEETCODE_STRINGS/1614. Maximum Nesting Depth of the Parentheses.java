package LEETCODE_STRINGS;
 class Solution {

    public int maxDepth(String s) {
        int currentDepth = 0; // Tracks the current depth.
        int maxDepth = 0; // Tracks the maximum depth encountered.

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                currentDepth++; // Increase depth for an opening parenthesis.
                maxDepth = Math.max(maxDepth, currentDepth); // Update max depth if current is greater.
            } else if (c == ')') {
                currentDepth--; // Decrease depth for a closing parenthesis.
            }
        }

        return maxDepth;
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "(1+(2*3)+((8)/4))+1";
        System.out.println(solution.maxDepth(s1)); // Output: 3

        String s2 = "(1)+((2))+(((3)))";
        System.out.println(solution.maxDepth(s2)); // Output: 3
    }
}

