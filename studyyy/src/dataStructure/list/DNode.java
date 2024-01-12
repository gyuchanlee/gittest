package dataStructure.list;

public class DNode<E> {

    private E item;
    private DNode previous;
    private DNode next;

    // 생성자
    public DNode(E newItem, DNode p, DNode q) {
        this.item = newItem;
        this.previous = p;
        this.next = q;
    }

    // 게터 세터
    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public DNode getPrevious() {
        return previous;
    }

    public void setPrevious(DNode previous) {
        this.previous = previous;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }
}
