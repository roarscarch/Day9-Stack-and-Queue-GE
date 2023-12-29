package org.example;

public class Queue<T> extends LinkedList<T> {
    public Queue() {
        super();
    }

    public void enqueue(T data) {
        super.add(data);
    }
    public void dequeue() {
        super.deleteFirst();
    }
}
