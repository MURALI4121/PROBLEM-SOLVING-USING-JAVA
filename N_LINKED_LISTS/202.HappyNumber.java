package N_LINKED_LISTS;

class HappyNumber {
    public class Solution {
        public boolean isHappy(int n) {
            int slow = n;
            int fast = getNext(n);

            // Using the Floyd's Cycle Detection algorithm to find cycles
            while (fast != 1 && slow != fast) {
                slow = getNext(slow);
                fast = getNext(getNext(fast));
            }

            // If we reach 1, then it's a happy number
            return fast == 1;
        }

        // Helper method to calculate the sum of squares of digits of a number
        private int getNext(int n) {
            int totalSum = 0;
            while (n > 0) {
                int d = n % 10; // get the last digit
                n = n / 10;     // remove the last digit
                totalSum += d * d; // square the digit and add to the sum
            }
            return totalSum;
        }
    }

}
