package List;

public class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Node peek() {
        return top;
    }

    public void push(Node node) {
        node.setNext(top);
        top = node;
    }

    public Node pop() {
        Node topNode = top;
        top = top.getNext();
        return topNode;
    }

    /**
     * Write a function using stacks that determines if a parenthesis sequence
     * is balanced or not. For example the parenthesis sequence ( { ( ) [ { } ] } ( ) ) is balanced, whereas the parenthesis sequence ( } ] ) ( is not.
     * You can assume that the character sequence contains just (, {, [, ), },
     * ] characters.
     * @param str
     * @return
     */
    public boolean isBalanced(String str) {
        int i;
        int length;
        Stack stack;

        length = str.length();
        stack = new Stack(1000);
        
    }
}
