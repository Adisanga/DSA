/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Submission_2;

/**
 *
 * @author DELL
 */
public class ArrayCircularQueue {
    private int[] queue;
    private int front, rear, size;

    public ArrayCircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }
    
    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % size;
        queue[rear] = data;
    }
    
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int data = queue[front];

        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % size;

        return data;
    }
    
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.display();

        System.out.println("Dequeued: " + q.dequeue());

        q.display();
    }
    
}
