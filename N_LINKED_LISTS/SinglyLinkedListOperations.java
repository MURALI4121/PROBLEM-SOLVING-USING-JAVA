package N_LINKED_LISTS;

public class SinglyLinkedListOperations {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class NodeOperations {

        // Traversing the List
        public void printList(Node head) {
            Node current = head;

            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("Null");
        }

        //Inserting an item in the list
        public Node insertAtBegining(Node head, int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }

        // Insert at the end
        public Node insertAtEnd(Node head, int data) {
            Node newNode = new Node(data);
            if (head == null) {
                return newNode;
            }

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
            return head;
        }

        // insert at a specific position
        public Node insertAtPosition(Node head, int data, int position) {
            Node newNode = new Node(data);
            if (position == 1) {
                newNode.next = head;
                return newNode;
            }
            Node previous = head;
            for (int i = 0; i < position - 1; i++) {
                if (previous == null) throw new IllegalArgumentException("Position out of bounds");
                previous = previous.next;
            }
            newNode.next = previous.next;
            previous.next = newNode;
            return head;
        }

        //Delete the first node
        public Node deleteFirst(Node head) {
            if (head != null) {
                return head.next;
            }
            return null;
        }

        //Delete the last node
        public Node deleteLast(Node head) {
            if (head == null || head.next == null) {
                return null;
            }
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            return head;
        }

        //DeleteAtPosition
        public Node deleteAtPosition(Node head, int position) {
            if (head == null) {
                return null;
            }

            Node temp = head;
            if (position == 1) {
                head = temp.next;
                return head;
            }

            for (int i = 1; temp != null && i < position - 1; i++) {
                temp = temp.next;
            }

            if (temp == null || temp.next == null) {
                return head;
            }
            temp.next = temp.next.next;
            return head;
        }

        public static void main(String[] args) {
            Node head = new Node(10);

            NodeOperations ops = new NodeOperations();

            head = ops.insertAtEnd(head, 20);
            head = ops.insertAtEnd(head, 30);

            ops.printList(head);

            head = ops.insertAtBegining(head, 5);
            ops.printList(head);

            head = ops.insertAtPosition(head, 15, 3);
            ops.printList(head);

            head = ops.deleteAtPosition(head, 3);
            ops.printList(head);

            head = ops.deleteFirst(head);
            ops.printList(head);

            head = ops.deleteLast(head);
            ops.printList(head);


        }

    }

}




