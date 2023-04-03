package List;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public Node getHead() {
        return this.head;
    }

    public void insertFirst(Node newNode) {
        if (tail == null) {
            tail = newNode;
        }
        newNode.setNext(head);
        head = newNode;

    }

    public void insertLast(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public void insertMiddle(Node newNode, Node previousNode) {
        newNode.setNext(previousNode.getNext());
        previousNode.setNext(newNode);
    }

    public Node search(int value) {
        Node temp = head;
        while (temp != null) {
            if (value == temp.getData()) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public Node getNodeI(int i) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (index == i) {
                return temp;
            }
            index++;
            temp = temp.getNext();
        }
        return null;
    }

    public int numberOfElements() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public Node getPrevious(Node node) {
        Node temp = head;
        Node previous = null;
        while (temp != node) {
            previous = temp;
            temp = temp.getNext();
        }
        return previous;
    }

    public void deleteFirst() {
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
    }

    public void deleteLast() {
        tail = getPrevious(tail);
        if (tail != null) {
            tail.setNext(null);
        } else {
            head = null;
        }
    }

    public void deleteMiddle(Node node) {
        Node previous;
        previous = getPrevious(node);
        previous.setNext(node.getNext());
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            result.append(temp).append(" ");
            temp = temp.getNext();
        }
        return result.toString();
    }
}
