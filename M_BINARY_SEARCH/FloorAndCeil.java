package M_BINARY_SEARCH;

public class FloorAndCeil {


    static int floor(int[] arr, int n, int x){

        int low = 0;
        int high = n - 1;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            int mid = (low + high) / 2; // Move mid calculation inside the loop

            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }

            // Break out of the loop when low is greater than high
            if (low > high) {
                break;
            }
        }
        return ans;



    }

    public static int ceil(int[] arr , int n, int x){
        int low = 0; int high = n-1;
        int ans = -1;

        while(low<= high){
            int mid = (low + high)/2;
            if(arr[mid] >= x ){
                ans = arr[mid];

                high = mid - 1;

            }else {
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,4,7,8,10};

        int n = 6; int x = 6;

        int floorResult = floor(arr,n,x);
        int ceilResult = ceil(arr,n,x);

        System.out.println(" the floor number is " + floorResult);
        System.out.println(" the floor number is " + ceilResult);
    }
}
