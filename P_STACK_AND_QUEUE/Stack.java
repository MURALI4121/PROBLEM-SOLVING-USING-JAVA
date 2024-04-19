package P_STACK_AND_QUEUE;

public class Stack {
    private int[] elements;
    private int size;
    private int capacity;


    public Stack(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        size = 0;
    }

    //Push Operation
    public void push(int data) throws IllegalStateException{
        if(size == capacity){
            throw new IllegalStateException("Stack is full");
        }
        elements[size++] = data;
    }

    //Pop operation
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }

        return elements[--size];
    }

    //peek operation
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size-1];
    }

    //Check if the stack is empty
    public boolean isEmpty(){
        return size == 0;
    }

    //Size of the stack
    public int size(){
        return size;
    }

    //Main class to use Stack
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); //Outputs 30
        stack.push(40);
        System.out.println(stack.pop());  //Outputs 40
        System.out.println(stack.peek()); //Outputs 20
        System.out.println(stack.isEmpty()); //Outputs false
        System.out.println(stack.size());  //Outputs 2

    }
}





