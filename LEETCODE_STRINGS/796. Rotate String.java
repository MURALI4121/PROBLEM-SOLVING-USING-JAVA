package LEETCODE_STRINGS;

class RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String concatenated = s + s;
        return concatenated.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal)); // Output: true

        s = "abcde";
        goal = "abced";
        System.out.println(rotateString(s, goal)); // Output: false
    }
}

