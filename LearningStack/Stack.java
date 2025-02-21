package LearningStack;

public class Stack {
    private int maxSize;
    private int top=-1;
    private int array[];
    public Stack(int size){
        this.maxSize = size;
        array = new int[maxSize];
        top = -1;
    }
    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("stack overflow");
        } else {
            top++;
            array[top] = data;
        }
    }
    public void pop() {
        if (top == -1) {
            System.out.println("stack underflow");
            return;
        }
        else{
            int popElement = array[top];
            top--;
            System.out.println(popElement+" popped");
        }
    }
    public int peek() {
        if (top == -1) {
            return -1;
        }
        return array[top];
    }
    public void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            for(int i =0;i <= top;i++){
                System.out.print(array[i]+" ");
            }
        }
    }

}
