package N_LINKED_LISTS;

import org.w3c.dom.Node;

public class SinglyLL {
    private Node head;
    private Node tail;

    private int size;

    public SinglyLL() {
        this.size = 0;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;

        }
        size += 1;
    }

    public void insertLast(int data){
        if(tail == null){
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int data, int index){
        if(index == 0){
            insertFirst(data);
            return;
        }
        if(index == size){
            insertLast(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp= temp.next;
        }

        Node node =   new Node(data, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst(){
        int val = head.data;
        
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(10);
        list.insertLast(99);

        list.insert(100,3);
        list.display();

    }
}
