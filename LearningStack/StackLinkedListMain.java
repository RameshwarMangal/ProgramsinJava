package LearningStack;

public class StackLinkedListMain {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.display();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
//        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.display();

    }
}
