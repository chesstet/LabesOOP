package Lab7;

import Lab6.Automobile;

public class Node {
    private Automobile auto;
    private Node next;
    private Node previous;

    public Node(Automobile auto, Node next, Node previous) {
        this.auto = auto;
        this.next = next;
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Automobile getAutomobile() {
        return auto;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }


}
