package N_LINKED_LISTS;

// Definition for singly-linked list.
class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}

 class solution {
    public Node mergeTwoLists(Node l1, Node l2) {
        // A dummy node to start the merged list from
        Node dummy = new Node(0);
        Node tail = dummy;

        // Iterate while neither of the lists is null
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // Attach the remaining part of the longer list to the merged list
        if (l1 != null) {
            tail.next = l1;
        } else if (l2 != null) {
            tail.next = l2;
        }

        return dummy.next;  // Return the head of the merged list
    }
}

