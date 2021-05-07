package Jar;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> deque;

    public Jar() {
        this.deque = new ArrayDeque<>();
    }

    public void add(T t) {
        this.deque.push(t);
    }

    public T remove() {
        return this.deque.pop();
    }
}
