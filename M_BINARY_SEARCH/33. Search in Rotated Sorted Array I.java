package M_BINARY_SEARCH;

 class SearchInSortedArray {

    public static int searchInSortedArray(int[] nums, int n, int target) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            //we have to check whether left part is sorted or not
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                //if left part is not sorted then obviously then the right part is sorted one
                if (nums[mid + 1] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 1, 2, 3, 4, 5, 6};

        int n = 8;
        int target = 2;

        int result = searchInSortedArray(nums, n, target);

        System.out.println("the output is " + result);
    }
}
