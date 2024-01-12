package dataStructure.list;

public class Node <E> {
    private E item;
    private Node<E> next;

    public Node(E newItem, Node<E> next) {
        this.item = newItem;
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E newItem) {
        this.item = newItem;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> newNext) {
        this.next = newNext;
    }
}
