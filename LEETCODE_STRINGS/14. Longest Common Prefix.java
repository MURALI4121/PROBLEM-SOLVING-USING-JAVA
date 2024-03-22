package LEETCODE_STRINGS;

 class beautySum {
    public int beautySum(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] fr = new int[26];
            for (int j = i; j < s.length(); j++) {
                fr[s.charAt(j) - 'a']++;
                res += solve(fr);
            }
        }
        return res;
    }

    public int solve(int[] frq) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < frq.length; i++) {
            if (frq[i] == 0) {
                continue;
            }

            min = Math.min(min, frq[i]);
            max = Math.max(max, frq[i]);
        }
        return max - min;
    }

    public static void main(String[] args) {
        beautySum solution = new beautySum();

        // Example test cases
        String test1 = "aabcb";
        System.out.println("Beauty Sum of 'aabcb': " + solution.beautySum(test1));

        String test2 = "aabcbaa";
        System.out.println("Beauty Sum of 'aabcbaa': " + solution.beautySum(test2));
    }
}
