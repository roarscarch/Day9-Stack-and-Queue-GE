package org.example;

/*

create stack and use linked list for it
create push method

create pop method
*
*
* */

public class Stack<T> extends LinkedList<T> {

    public Stack() {
        super();
    }


    public void push(T data) {
        super.add(data);
    }
    public T peek() {
        if (this.size() == 0) {
            System.out.println("The Stack is empty.");
            return null;
        }
        return this.tail.data;
    }

    public void pop() {
        if (this.size() == 0) {
            System.out.println("The Stack is empty.");
            return;
        }
        super.deleteLast();
    }
}
