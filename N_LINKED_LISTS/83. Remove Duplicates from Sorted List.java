package N_LINKED_LISTS;


class ListNode{
    int val;
    Node next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public Node deleteDuplicates(Node head){
        if (head == null){
            return null;
        }

        Node current = head;
        while (current != null && current.next != null ){
            if(current.val == current.next.val){
                current.next = current.next.next; // skip the duplicate
            }

            else {
                current = current.next; // ove to the next different element
            }
        }

        return head;
    }
}
