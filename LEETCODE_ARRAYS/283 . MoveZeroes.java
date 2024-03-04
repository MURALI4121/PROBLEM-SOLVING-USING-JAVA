package LEETCODE_ARRAYS;

class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int j = 0;
        // loop for iteration
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println(" before moving zeroes");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println(" after moving zeroes");

        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
