package com.bridgelabz;

class Node<T> {
    T data;
    Node<T> next;
}

public class LinkList<T> {
    Node<T> head;
    Node<T> tail = null;

    public void add(T data) {
        Node<T> new_node = new Node<T>();
        new_node.data = data;
        if (head == null) {
            head = new_node;
        } else {
            Node<T> n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new_node;
        }
    }

    public void insertAt(int index, T data) {
        Node<T> new_node = new Node<T>();
        new_node.data = data;
        new_node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node<T> n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            new_node.next = n.next;
            n.next = new_node;
        }
    }

    public void insertAtStart(T data) {
        Node<T> new_node = new Node<T>();
        new_node.data = data;
        new_node.next = null;
        new_node.next = head;
        head = new_node;
    }

    public void deleteAtStart() {
        Node<T> node = head;
        head = head.next;
        System.out.println("Node deleted is: " + node.data);
        node = null;
    }

    public void deleteAtEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            Node temp = head;
            tail = head;
            while (tail.next.next != null) {
                temp = tail.next.next;
                tail = tail.next;
            }
            tail.next = null;
            System.out.println("\nNode Deleted: " + temp.data);
        }
    }

    public void show() {
        Node<T> n = head;
        while (n.next != null) {
            System.out.print( n.data + "->");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        LinkList<Integer> linkedLst = new LinkList<>();
        linkedLst.add(56);
        linkedLst.add(30);
        linkedLst.add(70);
        linkedLst.show();

        linkedLst.deleteAtEnd();
        System.out.println("List after deleting last node: ");
        linkedLst.show();

    }
}