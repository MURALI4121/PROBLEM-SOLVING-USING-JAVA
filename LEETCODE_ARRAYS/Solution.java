package LEETCODE_ARRAYS;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Check each other element in the array, but only up to k elements away
            for (int j = i + 1; j < nums.length && j <= i + k; j++) {
                // If we find a pair that meets the conditions, return true
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        // If no such pair is found, return false
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test the method with example inputs
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println(solution.containsNearbyDuplicate(nums1, k1)); // Output: true

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println(solution.containsNearbyDuplicate(nums2, k2)); // Output: true

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println(solution.containsNearbyDuplicate(nums3, k3)); // Output: false
    }
}

