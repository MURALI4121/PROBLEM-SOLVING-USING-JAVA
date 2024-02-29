package LEETCODE_ARRAYS;

class CheckingIfArrayIsSorted {

    public static boolean check(int[] nums, int n) {

//       First Approach #1
//        for(int i = 0; i<n; i++){
//            for(int j = i+1; j<n; j++){
//                if(nums[j]<nums[i])
//                    return false;
//            }
//        }
//        return true;

//      Second approach #2
//        for (int i = 1; i < n; i++) {
//            if(nums[i]<nums[i-1])
//                return false;
//        }
//        return true;
        int count = 0;

        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1])
                count++;
        }

        if(count == 0)
            return true;
        else if(count > 1)
            return false;
        else if(nums[0] >= nums[nums.length-1])
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        int[] array = {3,4,5,6,1,7,8};
        int n = array.length;
        System.out.println(check(array,n));

    }
}
