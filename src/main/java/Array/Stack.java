package Array;

public class Stack {
    private Element[] array;
    private int top;
    private int N;

    public Stack(int N) {
        this.N = N;
        array = new Element[];
        top = -1;
    }

    boolean isFull() {
        return top == N - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    public Element peek() {
        return array[top];
    }

    public void push(Element element) {
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
