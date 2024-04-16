package N_LINKED_LISTS;

class LinkedList {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Method to delete the last node from the doubly linked list
    public static Node deleteLastNode(Node head) {
        if (head == null) {
            return null; // List is already empty
        }
        if (head.next == null) {
            return null; // Only one element, return an empty list
        }

        Node last = head;
        // Traverse to the end of the list
        while (last.next != null) {
            last = last.next;
        }

        // Remove the last node
        if (last.prev != null) {
            last.prev.next = null;
        }

        return head;
    }

    public static void main(String[] args) {
        // Creating a sample doubly linked list: 4 <-> 10 <-> 3 <-> 5 <-> 20
        Node head = new Node(4);
        Node node1 = new Node(10);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(20);

        head.next = node1;
        node1.prev = head;
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;

        // Deleting the last node
        head = deleteLastNode(head);

        // Printing modified linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
