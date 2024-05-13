package question3;


class Stack {
    private int maxSize;
    private int[] num;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.num = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
       
        num[++top] = value;
    }

    public int pop() {
       
        return num[top--];
    }

    public int peek() {
       
        return num[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

class LinearQueue {
    private Stack inbox;  
    private Stack outbox; 
    public LinearQueue(int capacity) {
        inbox = new Stack(capacity);
        outbox = new Stack(capacity);
    }

    public void enqueue(int item) {
        inbox.push(item);
    }

    public int dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
       
        return outbox.pop();
    }

    public int peek() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
       
        return outbox.peek();
    }

    public boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }
}

public class Q3 {
    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);

        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(8);
        System.out.println(queue.peek());
    }
}

