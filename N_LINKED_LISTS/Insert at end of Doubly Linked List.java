package N_LINKED_LISTS;

class Nod {
    int value;
    Nod next;
    Nod prev;

    public Nod(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class DLLInsertAtEnd {

    // Method to insert a node at the end of the list
    public static Nod insertAtEnd(Nod head, int k) {
        Nod newNode = new Nod(k);

        // Check if the list is empty
        if (head == null) {
            return newNode; // This new node becomes the head of the list
        }

        // If the list is not empty, traverse to the end
        Nod current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Insert the new node at the end
        current.next = newNode;
        newNode.prev = current;

        return head;
    }

    public static void main(String[] args) {
        // Example usage
        Nod head = new Nod(4);
        Nod second = new Nod(10);
        Nod third = new Nod(3);
        Nod fourth = new Nod(5);

        // Linking the nodes
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;

        // Insert 20 at the end
        head = insertAtEnd(head, 20);

        // Printing the list
        Nod temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}
