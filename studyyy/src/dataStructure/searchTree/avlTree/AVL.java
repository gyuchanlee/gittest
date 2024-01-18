package dataStructure.searchTree.avlTree;


public class AVL<Key extends Comparable<Key>, Value> {

    public Node root;

    public Node getRoot() {
        return root;
    }

    public AVL(Key newId, Value newName, int newHeight) {
        root = new Node(newId, newName, newHeight);
    }

    // 삽입
    // 이진 트리와 초반은 동일.
//    public void put(Key k, Value v) {
//        root = put(root, k, v);
//    }

//    public Node put(Node n, Key k, Value v) {
//        if (n == null) {
//            return new Node(k, v, 1);
//        }
//        int t = k.compareTo((Key) n.getId());
//    }

}
