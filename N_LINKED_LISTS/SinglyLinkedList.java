package N_LINKED_LISTS;

import org.w3c.dom.Node;

public class SinglyLinkedList {
    private Node head; // head of the list

    //inner claas representing a node in the list

    private static class Node {
        int data; // data for the node
        Node next; // Reference to the next node

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // adding a node at the front of the list

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //adding a node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastnode = head;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
        }
        lastnode.next = newNode;
    }

    // adding a node after a given node (assuming 'prevNode' is not null)

    public void addAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Deleting the first occurrence of a key in the list

    public void deleteByKey(int key) {
        //If head node itself holds the key
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        // search for the key to be deleted

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // if key was not present in the list
        if (temp == null) return;

        // Unlink the node from h=the list
        prev.next = temp.next;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " -> ");
            tnode = tnode.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);
        list.addLast(3); // The list is now 0 -> 1 -> 2 -> 3 -> NULL

        list.printList();
        System.out.println();
        list.deleteByKey(2); // Delete node with data 2
        list.printList(); // The list is now 0 -> 1 -> 3 -> NULL

    }

}
