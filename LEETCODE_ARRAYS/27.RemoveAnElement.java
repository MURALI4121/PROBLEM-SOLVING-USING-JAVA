package LEETCODE_ARRAYS;

class RemoveAnElement {


    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3; // value to the remove from the array

        int newLength = removeElement(nums, val);
        System.out.println("New Length : " + newLength);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        int[] nums1 = {0,1,2,2,3,0,4,2} ;
        int val1 = 2;

        int newLength1 = removeElement(nums1, val1);
        System.out.println("New Length : " + newLength1);

        for (int i = 0; i < newLength1; i++) {
            System.out.print(nums1[i] + " ");
        }


    }

    public static int removeElement(int[] nums, int val) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
