/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package submission_1;

/**
 *
 * @author DELL
 */
public class UnboundedArrayStack {
    private int[] stack;
    private int top;
    
    public UnboundedArrayStack() {
        stack = new int[2];
        top = -1;
    }
    
    public void push(int value) {
        if (top == stack.length - 1) {
            resize(stack.length * 2);
        }

        stack[++top] = value;
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = stack[top--];

        if (top + 1 > 0 && top + 1 <= stack.length / 4) {
            resize(stack.length / 2);
        }

        return value;
    }
    
    private void resize(int newSize) {
        int[] newStack = new int[newSize];

        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    
    public static void main(String[] args) {
        UnboundedArrayStack stack = new UnboundedArrayStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped: " + stack.pop());
    }
    
}
