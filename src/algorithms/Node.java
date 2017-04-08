package algorithms;

/**
 * Created by asus pc on 08.04.2017.
 */
public class Node {
    private int value;
    private Node next;
    private Node prev;

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getValue() {

        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public Node(int value) {

        this.value = value;
    }
}
