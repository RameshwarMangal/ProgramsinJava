package LearningQueue;

public class SimpleQueue {
    int capacity;
    int queue[];
    int front;
    int rear;
    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front  = 0;
        this.rear = -1;
    }
    public void enqueue(int item) {
        if(rear == capacity-1) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = item;
    }
    public int dequeue() {
        if(front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front];
        front ++;
        return data;
    }
    public int peek() {
        if(front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    public void display(){
        if(front > rear) {
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front;i<=rear;i++) {
                System.out.print(queue[i]+"\t");
            }
        }
    }
}
