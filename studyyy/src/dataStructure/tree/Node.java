package dataStructure.tree;

public class Node <Key extends Comparable<Key>>{
    private Key item;
    private Node<Key> left;
    private Node<Key> right;

    public Node(Key newItem, Node<Key> lt, Node<Key> rt) {
        this.item = newItem;
        this.left = lt;
        this.right = rt;
    }

    public Key getKey() {
        return item;
    }

    public void setKey(Key newItem) {
        this.item = newItem;
    }

    public Node<Key> getLeft() {
        return left;
    }

    public void setLeft(Node<Key> lf) {
        this.left = lf;
    }

    public Node<Key> getRight() {
        return right;
    }

    public void setRight(Node<Key> rt) {
        this.right = rt;
    }
}
