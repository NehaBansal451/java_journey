package com.LinkedList;
public class CircularLL {

    private Node head;
    private Node tail;

    public CircularLL() {
        head = null;
        tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }
    public void display() {
        if (head == null) {
            return;
        }

        Node node = head;

        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        } while (node != head);

        System.out.println("(back to head)");
    }

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
