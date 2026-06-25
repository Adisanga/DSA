/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Submission_2;

/**
 *
 * @author DELL
 */
public class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = next = null;
        }
    }

    Node head;
    
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }
    
    public void displayForward() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }

        System.out.println("null");
    }
    
    public void displayBackward() {
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }

        System.out.println("null");
    }
    
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(100);
        list.insert(200);
        list.insert(300);

        System.out.println("Forward:");
        list.displayForward();

        System.out.println("Backward:");
        list.displayBackward();
    }
}
