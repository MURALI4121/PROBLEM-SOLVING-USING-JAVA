package M_BINARY_SEARCH;

public class implementLowerBound {

    public static int lowerBound(int[] arr, int n, int x){

        //this is optimal approach using binary search
        int low = 0; int high = n-1; int ans = n;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }

        return ans;
        // this is bruteforce approach
//        for(int i = 0; i<n-1; i++){
//            if(arr[i] >= x){
//                return i;
//            }
//        }
//        return n;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int n = 5; int x = 6;

        int result = lowerBound(arr,n,x);

        System.out.println("the lower bound is " + result);

    }
}
