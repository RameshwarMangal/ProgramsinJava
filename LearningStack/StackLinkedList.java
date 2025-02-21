package LearningStack;

public class StackLinkedList {
    private Node top;
    StackLinkedList() {
        this.top = null;
    }
    public void push(int data) {
            Node newNode =new Node(data);
            newNode.next = top;
            top = newNode;
    }
    public int pop() {
        if(isEmpty())
            return -1;
        int val=top.data;
        top=top.next;
        return val;
    }
    public int peek() {
        if(isEmpty())
            return -1;
        return top.data;
    }
    public boolean isEmpty() {
        return this.top == null;
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }else{
            Node temp=top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }


    }
}
