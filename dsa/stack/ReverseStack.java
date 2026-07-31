package stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(25);

        System.out.println("Original Stack : " + stack);
        System.out.print("Reverse Stack : ");
        reverseStack(stack);
        System.out.print(stack);
    }

    static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top, s);
    }

    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
}
