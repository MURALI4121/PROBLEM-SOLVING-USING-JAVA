package N_LINKED_LISTS;

class MiddleOfTheLL {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public class Solution {
        public ListNode middleNode(ListNode head) {
            if (head == null) return null;

            ListNode slow = head;   // Start slow at head
            ListNode fast = head;   // Start fast at head

            // Move fast at 2x speed and slow at 1x speed
            while (fast != null && fast.next != null) {
                slow = slow.next;          // Move slow by 1
                fast = fast.next.next;     // Move fast by 2
            }

            // Slow is now at the middle node
            return slow;
        }
    }

}
