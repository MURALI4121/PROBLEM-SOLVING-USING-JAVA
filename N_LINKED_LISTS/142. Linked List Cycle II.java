package N_LINKED_LISTS;


class LinkedListCycleII {


     //Definition for singly-linked list.
     class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
          }
     }
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null) {
                return null; // No cycle if there's less than two nodes
            }

            ListNode slow = head; // Slow pointer starts at the head
            ListNode fast = head; // Fast pointer also starts at the head

            while (fast != null && fast.next != null) {
                slow = slow.next;          // Move slow pointer one step
                fast = fast.next.next;     // Move fast pointer two steps

                if (slow == fast) {        // A cycle has been detected
                    // Move one pointer to the start to find the entry location of the cycle
                    ListNode entry = head;
                    while (entry != slow) {
                        entry = entry.next;
                        slow = slow.next;
                    }
                    return entry; // This is the start of the cycle
                }
            }

            return null; // No cycle detected
        }
    }

}
