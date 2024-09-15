package Queue;

import Stack.MyStack;

public class MyQueue {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node front;
    private Node rear;
    private int length;

    public MyQueue(){
        front = null;
        rear = null;
        length = 0;
    }
    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        // TH1 : Queue Null => front noi node dau tien
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }
        else{
          rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }

        int elementRemoved = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        
        length--;
        return elementRemoved;
    }
    // dequeue(): remove front element and return data of removed element
// BTVN 1: 2 , 19 -> LeetCode
// BTVN 2: Implement Stack and Queue
    public static void main(String[] args) {
        //queue
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Queue length: " + queue.getLength());
        System.out.println("Dequeued front element: " + queue.dequeue());
        System.out.println("Queue length after dequeqe: " + queue.getLength());
        System.out.println("\n");

        //stack
        MyStack stack = new MyStack();
        stack.push(0);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        System.out.println("Stack length: " + stack.getLength());
        System.out.println("Popped top element: " + stack.pop());
        System.out.println("Stack length after pop: " + stack.getLength());
    }

}
