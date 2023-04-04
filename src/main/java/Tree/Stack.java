package Tree;

import Array.Element;

public class Stack {
    private Array.Element[] array;
    private int top;
    private int N;

    public Stack(int N) {
        this.N = N;
        array = new Array.Element[N];
        top = -1;
    }

    boolean isFull() {
        return top == N - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public Array.Element peek() {
        return array[top];
    }

    public void push(Array.Element element) {
        if (!isFull()) {
            top++;
            array[top] = element;
        }
    }

    public Element pop() {
        if (!isEmpty()) {
            top--;
            return array[top + 1];
        }
        return null;
    }
}
