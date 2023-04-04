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

    public int findSmallest() {
        int smallest;
        Node temp;
        temp = head;
        smallest = temp.getData();
        while (temp != null) {
            if (temp.getData() < smallest) {
                smallest = temp.getData();
            }
            temp = temp.getNext();
        }
        return smallest;
    }

    /**
     * Given a sorted linked list, write a function to add a new integer without
     * destroying the sortedness property.
     * @param value
     */
    public void insertToSortedList(int value) {
        Node previous = null;
        Node temp = head;
        Node newNode;
        while (temp != null && temp.getData() <= value) {
            previous = temp;
            temp = temp.getNext();
        }
        newNode = new Node(value);
        insertMiddle(newNode, previous);
    }

    public void deleteNodeI(int i) {
        Node temp = head;
        Node previous = null;
        int j = 0;
        while (j < i) {
            j++;
            previous = temp;
            temp = temp.getNext();
        }
        if (previous == null) {
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
        } else {
            previous.getNext() = temp.getNext();
            if (previous.getNext() == null) {
                tail = previous;
            }
        }

    }

    /**
     * Given node X, write a function to move that node n position forward.
     * Assume that there are at least n nodes after node X.
     * @param X
     * @param n
     */
    public void move(Node X, int n) {
        Node previous1 = null;
        Node previous2;
        Node temp = head;
        int i;
        while (temp != X) {
            previous1 = temp;
            temp = temp.getNext();
        }
        i = 0;
        previous2 = X;
        while (i != n) {
            previous2 = previous2.getNext();
            i++;
        }
        if (previous1 != null) {
            previous1.getNext() = X.getNext();
        }
        X.getNext() = previous2.getNext();
        previous2.getNext() = X;
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
