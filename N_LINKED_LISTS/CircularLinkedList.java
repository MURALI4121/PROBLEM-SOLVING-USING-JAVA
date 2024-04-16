package N_LINKED_LISTS;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int data){
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
            node.next = head; // point to itself to maintain the circular nature
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }

    public void display(){
        if (head != null) {
            Node node = head;
            do {
                System.out.print(node.data + " -> ");
                node = node.next;
            } while (node != head);
            System.out.println("(head)");
        } else {
            System.out.println("The list is empty.");
        }
    }

    public void delete(int data){

        Node node = head;

        if(node == null){
            return;
        }

        if(node.data == data){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.data == data){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);

    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; // Explicitly setting next to null
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(23);
        list.insert(25);
        list.insert(27);
        list.insert(26);
        list.insert(28);
        list.insert(29);
        list.display();
        list.delete(27);
        list.display();
    }
}
