package LEETCODE_ARRAYS;

public class MissingNumber {

    public static int missingNumber(int[] nums ) {

        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for (int i = 0; i < n ; i++) {
            actualSum = actualSum + nums[i];
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};

        int result = missingNumber(nums);
        System.out.println("the missing number is : " + result);
    }
}
