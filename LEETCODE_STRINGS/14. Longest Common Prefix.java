package LEETCODE_STRINGS;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first string in the array as the prefix
        String prefix = strs[0];

        // Iterate over the array of strings
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix is empty, no common prefix exists
                if(prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    // Test the method
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String[] strs1 = {"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(strs1));  // Output: "fl"

        // Example 2
        String[] strs2 = {"dog","racecar","car"};
        System.out.println(solution.longestCommonPrefix(strs2));  // Output: ""
    }
}
