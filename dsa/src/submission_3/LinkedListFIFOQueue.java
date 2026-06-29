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
public class LinkedListFIFOQueue {
    
    Node front;
    Node rear;

    public void enqueue(int data) {

        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }
    
    public void dequeue() {

        if (front == null) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Removed: " + front.data);

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }
    
    public void display() {

        if (front == null) {
            System.out.println("Queue Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    
    public static void main(String[] args) {

        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Queue:");
        queue.display();

        queue.dequeue();

        System.out.println("After Dequeue:");
        queue.display();
    }
    
}
