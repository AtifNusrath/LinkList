package com.bridgelabz;

public class LinkList<T> {
    private LinkedNode<T> first;
    private LinkedNode<T> last;
    private int count;


    private class LinkedNode<T> {
        private T data;
        private LinkedNode<T> next;

        public LinkedNode() {
            this.data = null;
            this.next = null;
        }

        public LinkedNode(T obj) {
            this.data = obj;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public LinkedNode<T> getNext() {
            return next;
        }

        public void setNext(LinkedNode<T> next) {
            this.next = next;
        }

    }

    public LinkList() {
        LinkedNode<T> newLiked = new LinkedNode<T>();
        this.first = newLiked;
        this.last = this.first;
    }

    public void add(T data) {
        LinkedNode<T> newData = new LinkedNode<T>(data);
        if (this.first.getData() == null) {
            this.first = newData;
            this.last = this.first;
        } else {
            this.last.setNext(newData);
            this.last = newData;
        }
        count++;
    }

    public static void main(String[] args) {
        LinkList<Integer> linkedLst = new LinkList<>();
        linkedLst.add(56);
        linkedLst.add(30);
        linkedLst.add(70);
    }
}