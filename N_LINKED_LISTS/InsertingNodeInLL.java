package N_LINKED_LISTS;

public class InsertingNodeInLL {  // More generic class name

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node arrayToList(int[] arr) {
        Node head = null;
        Node tail = null;

        for (int element : arr) {
            // Create a new node for each element
            Node newNode = new Node(element);
            // If the list is empty, set head and tail to the new node
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                // Link the new node to the current tail
                tail.next = newNode;
                // Update tail to point to the newly added node
                tail = newNode;
            }
        }

        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // You can add methods for inserting nodes, searching, deletion, etc. here

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1};
        Node head = arrayToList(arr);
        printList(head);
    }
}
