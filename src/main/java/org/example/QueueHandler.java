package org.example;

public class QueueHandler {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
    }
}
