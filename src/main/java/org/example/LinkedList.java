package org.example;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void deleteNode(T data) {
        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            deleteFirst();
            return;
        }

        if (tail.data.equals(data)) {
            deleteLast();
            return;
        }

        Node<T> temp = head;
        while (temp.next != null && !temp.next.data.equals(data)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void insertAfterNode(T sourceNodeData, T newNodeData) {
        int index = search(sourceNodeData);
        if (index == -1) {
            System.out.println("Source node not found.");
            return;
        }
        insertAt(index + 1, newNodeData);
    }

    public int search(T data) {
        Node<T> temp = head;
        int index = 0;
        for (; temp != null; temp = temp.next, index++) {
            if (temp.data.equals(data)) {
                return index;
            }
        }
        return -1;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = tail = null;
            return;
        }

        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }

        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public void insertAt(int index, T data) {
        if (index < 0 || index > size()) {
            System.out.println("Invalid index.");
            return;
        }

        Node<T> node = new Node<>(data);
        if (index == 0) {
            addFirst(data);
        } else {
            Node<T> temp = head;
            for (int i = 0; i < index - 1; i++, temp = temp.next);
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public int size() {
        Node<T> node = head;
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder listData = new StringBuilder();
        Node<T> node = head;
        while (node != null) {
            listData.append(node.data).append(" ");
            node = node.next;
        }
        return listData.toString();
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
