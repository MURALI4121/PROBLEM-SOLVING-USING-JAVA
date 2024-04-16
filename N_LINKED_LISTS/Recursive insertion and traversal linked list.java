package N_LINKED_LISTS;

class RecursiveLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{
        Node head;

        public LinkedList() {
            head = null;
        }

        //Recursive method to insert data

        public void insert (int data){
            head = insertRecussive(head, data);
        }

        private Node insertRecussive(Node current, int data){
            if(current == null){
                return new Node(data);
            }

            current.next = insertRecussive(current.next, data);
            return current;
        }

        public void traverse(){
            System.out.print(" List Contents : ");
            traverseRecursive(head);
            System.out.println();
        }

        private void traverseRecursive(Node node){
            if(node != null){
                System.out.print(node.data + " ");
                traverseRecursive(node.next);
            }
        }
    }

    public static void main(String[] args) {
        // Insert elements into the list

        LinkedList list = new LinkedList();
        // Insert elements into the list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        //traverse and print the list

        list.traverse();

    }
}
