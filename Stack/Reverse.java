package Stack;

import java.util.Stack;

public class Reverse {

    // Function to push an element at the bottom of the stack using recursion
    public static void pushAtBottom(Stack<Integer> stack, int data) {
        // Base case: If stack is empty, push the data
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        // Recursive step: Pop the top, push data at bottom, then push top back
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }

    // Function to reverse the stack using recursion
    public static void reverseStack(Stack<Integer> stack) {
        // Base case: If stack is empty, no reversal needed
        if (stack.isEmpty()) {
            return;
        }

        // Recursive step: Pop top, reverse remaining stack, push top at bottom
        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }

    public static void main(String[] args) {
        // Create a stack and push elements into it
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Print original stack
        System.out.println("Original Stack: " + stack);

        // Reverse the stack
        reverseStack(stack);

        // Print reversed stack
        System.out.println("Reversed Stack: " + stack);
    }
} 
