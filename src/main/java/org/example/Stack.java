package org.example;

/*

create stack and use linked list for it
create push method
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
}
