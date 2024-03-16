package LEETCODE_STRINGS;

 class AnagramChecker {

    public static boolean isAnagram(String s, String t) {
        // If the lengths of the strings are not equal, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array to count the occurrence of each character in s and t.
        // Assuming the input strings contain only lowercase alphabets, we need 26 slots.
        int[] counts = new int[26];

        // Count the occurrences of each character in s
        // and subtract the count for each character in t
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++; // Increment count for char in s
            counts[t.charAt(i) - 'a']--; // Decrement count for char in t
        }

        // If all counts are 0, then t is an anagram of s
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(isAnagram(s1, t1)); // Output: true

        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s2, t2)); // Output: false
    }
}

