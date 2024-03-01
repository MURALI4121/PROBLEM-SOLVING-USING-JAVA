package LEETCODE_ARRAYS;

import java.util.HashSet;

class RemoveDuplicateElements {

    public int removeDuplicates(int[] nums){
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
    }

    public void printArray(int[] nums, int newLength){
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        RemoveDuplicateElements duplicate = new RemoveDuplicateElements();
        int[] nums = {0,0,1,1,-1,2,2,3,3,4};

        int newLength = duplicate.removeDuplicates(nums);

        System.out.println("After Removing Duplicate Elements : ");
        duplicate.printArray(nums, newLength);


    }
}
