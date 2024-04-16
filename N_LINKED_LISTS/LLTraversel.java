package N_LINKED_LISTS;

public class LLTraversel {
    // Class representing a single node in a linked list
    static class Node {
        int data;
        Node next;

        // Constructor initializes the node with data
        public Node(int data) {
            this.data = data;
            this.next = null; // Correctly initializing next to null
        }
    }

    // LinkedList class to manage a list of nodes
    static class LinkedList {
        Node head; // Using proper Java naming conventions

        // Constructor initializes an empty linked list
        public LinkedList() {
            this.head = null;
        }

        // Method to add a node at the beginning of the list
        public void addFront(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Method to traverse the list and print each node's data
        public void traverse() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the linked list
        list.addFront(10);
        list.addFront(20);
        list.addFront(30);

        // Displaying the linked list
        System.out.println("Linked list traversal:");
        list.traverse();
    }
}
