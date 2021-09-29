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
        linkedLst.add(30);
        linkedLst.add(70);
        linkedLst.show();
    }
}
