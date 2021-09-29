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
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void search(T item) {

        Node node = head;
        int position = 0;
        if (head == null) {
            System.out.println("List is Empty");
        }
        while (node.next != null) {
            ++position;
            if (node.data.equals(item)) {
                System.out.println("\nElement " + item + " present at position: " + position);
            }
            node = node.next;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> n = head;
            Node<T> n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("Node deleted is: " + n1.data);
            n1 = null;
        }
    }
    public int size()
    {
        Node n = head;
        int counter =1;
        while(n.next!= null) {
            counter++;
            n = n.next;
        }
        return counter;
    }

    public static void main(String[] args) {
        LinkList<Integer> linkedLst = new LinkList<>();
        linkedLst.add(56);
        linkedLst.add(30);
        linkedLst.add(70);
        System.out.println("\nLinked List: ");
        linkedLst.show();

        linkedLst.insertAt(2, 40);
        System.out.print("\nLinkedList after insert 40 after 30: ");
        linkedLst.show();

        linkedLst.deleteAt(2);
        System.out.println("\nLinked List after deletion: ");
        linkedLst.show();
        System.out.println("Size of linked list: " +linkedLst.size());


    }
}
