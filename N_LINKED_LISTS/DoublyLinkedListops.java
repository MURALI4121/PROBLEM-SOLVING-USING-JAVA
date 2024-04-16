package N_LINKED_LISTS;

class NODE {
    int data;
    NODE prev;
    NODE next;

    // Node constructor
    public NODE(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    NODE head, tail;

    // Adding a node at the front of the list
    public void insertAtFront(int data) {
        NODE newNODE = new NODE(data);
        if (head == null) {
            head = tail = newNODE;
        } else {
            newNODE.next = head;
            head.prev = newNODE;
            head = newNODE;
        }
    }

    // Adding a node at the end of the list
    public void insertAtEnd(int data) {
        NODE newNODE = new NODE(data);
        if (tail == null) {
            head = tail = newNODE;
        } else {
            tail.next = newNODE;
            newNODE.prev = tail;
            tail = newNODE;
        }
    }

    // Adding a node after a given node
    public void insertAfterNode(NODE prevNODE, int data) {
        if (prevNODE == null) {
            System.out.println("Previous node cannot be null");
            return;
        }
        NODE newNODE = new NODE(data);
        newNODE.next = prevNODE.next;
        newNODE.prev = prevNODE;
        prevNODE.next = newNODE;
        if (newNODE.next != null) {
            newNODE.next.prev = newNODE;
        } else {
            tail = newNODE; // Update tail if the new node is the last node
        }
    }

    // Method to delete the first node
    public void deleteFirst() {
        if (head == null) return;
        NODE toDelete = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;  // List is now empty
        }
        toDelete = null; // Help garbage collection
    }

    // Method to delete the last node
    public void deleteLast() {
        if (tail == null) return;
        NODE toDelete = tail;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;  // List is now empty
        }
        toDelete = null; // Help garbage collection
    }

    // Method to delete a node in the middle
    public void deleteNode(NODE node) {
        if (node == null || head == null) return;
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;  // Node is the head
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;  // Node is the tail
        }
        node = null; // Help garbage collection
    }

    // Display the list
    public void displayForward() {
        System.out.print("Forward: ");
        NODE current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        System.out.print("Backward: ");
        NODE current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtFront(10);
        dll.insertAtFront(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        System.out.println("List after inserting 20, 10 at the front and 30, 40 at the end:");
        dll.displayForward();
        dll.displayBackward();

        dll.insertAfterNode(dll.head.next, 25); // Insert 25 after second node (10)
        System.out.println("List after inserting 25 after second node:");
        dll.displayForward();
        dll.displayBackward();

        dll.deleteFirst();
        System.out.println("List after deleting the first node:");
        dll.displayForward();
        dll.displayBackward();

        dll.deleteLast();
        System.out.println("List after deleting the last node:");
        dll.displayForward();
        dll.displayBackward();

        dll.deleteNode(dll.head.next); // Delete middle node (25)
        System.out.println("List after deleting middle node (25):");
        dll.displayForward();
        dll.displayBackward();
    }
}
