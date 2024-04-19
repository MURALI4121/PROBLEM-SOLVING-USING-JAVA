package P_STACK_AND_QUEUE;

public class Queue {

    private int[] elements; // array to store the que elements
    private int front; // Index of the front element of the queue
    private int rear; // Index where tthe next element will be inserted
    private int size; // current number of elements in the queue
    private int capacity; //Maximum number of elements the queue can hold

    public Queue(int capacity) {
        this.capacity = capacity; // Set the maximum number of items the queue can hold
        elements = new int[capacity]; //initialize the array with the given capacity
        front = 0; // Front index starts at 0
        rear = -1; // Rear starts at -1, indicating no elements are present
        size = 0; // Initializes the size of the queue as 0
    }

    //Enque operation
    public void enqueue(int data) throws IllegalStateException{
        if(size == capacity){
            throw new IllegalStateException("Queue is full"); // Check if the queue is already is full
        }

        rear = (rear + 1) % capacity; // increment ear circularly
        elements[rear] = data; // insert new data at the incremented rear position
        size++; //Increment the size of the queue
    }

    //Dequeue operation
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty"); // Check if the queue is empty
        }

        int data = elements[front]; // retrieve the front element
        front = (front + 1) % capacity; // Increment front index circularly
        size--; // Decrement the size of the queue
        return data; // return the dequeued element
    }

    //Peek operation
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException(" Queue is empty"); //Check if the queue is empty
        }
        return elements[front]; //Return the element at the front of teh queue
    }

    //Check if the queue is empty
    public boolean isEmpty(){
        return size == 0; //Returns true if the queue is empty
    }

    //size of the queue
    public int size(){
        return size; // Returns the current number of elements in the queue
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5); //create a queue with capacity 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); //output 10
        queue.enqueue(40);

        System.out.println(queue.dequeue()); //outputs 20
        System.out.println(queue.peek()); //outputs 30
        System.out.println(queue.peek()); //outputs false
        System.out.println(queue.size()); //Outputs 2
    }


}
