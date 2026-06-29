/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package submission_3;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

/**
 *
 * @author DELL
 */
public class LinkedListStack {
    Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Removed: " + top.data);
        top = top.next;
    }
    
    public void peek() {
        if (top == null) {
            System.out.println("Stack Empty");
        } else {
            System.out.println("Top Element: " + top.data);
        }
    }
    
    public void display() {
        if (top == null) {
            System.out.println("Stack Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    
    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack:");
        stack.display();

        stack.peek();

        stack.pop();

        System.out.println("After Pop:");
        stack.display();
    }
    
}
