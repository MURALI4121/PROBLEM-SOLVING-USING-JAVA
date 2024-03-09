package M_BINARY_SEARCH;

public class ImplementUpperBound {

    public static int upperBound(int[] arr, int x, int n){

        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] > x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
        // this is brute force approach
//        for (int i = 0; i < n; i++) {
//            if(arr[i] > x){
//                return i;
//            }
//
//        }
//        return n;

    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,15,19};

        int n = 6; int x = 9;

        int result = upperBound(arr,x,n);

        System.out.println("This index is the upper bound " + result);
    }
}
