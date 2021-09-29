package com.bridgelabz;

class Node<T> {
    T data;
    Node<T> next;
}

public class LinkList<T> {
    Node<T> head;
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
        Node<T> n = head;
        head = head.next;
        System.out.println("Node deleted is: " + n.data);
        n = null;
    }

    public void show() {
        Node<T> n = head;
        while (n.next != null) {
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.println(n.data);
    }
    public static void main(String[] args) {
        LinkList<Integer> linkedLst = new LinkList<>();
        linkedLst.add(56);
        linkedLst.add(70);
        linkedLst.show();
        linkedLst.insertAt(1,30);
        linkedLst.show();
        linkedLst.deleteAtStart();
        linkedLst.show();
    }

}