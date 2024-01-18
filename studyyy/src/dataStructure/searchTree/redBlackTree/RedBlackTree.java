package dataStructure.searchTree.redBlackTree;

public class RedBlackTree<Key extends Comparable<Key>, Value> {
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private Node root;
    private static class Node <Key extends Comparable<Key>, Value> {
        Key id;
        Value name;
        Node left, right;
        boolean color;

        public Node(Key id, Value name, boolean color) {
            this.id = id;
            this.name = name;
            this.color = color;
            left = right = null;
        }
    }

    private boolean isEmpty() {
        return root == null;
    }

    private boolean isRed(Node n) {
        if (n == null) {
            return false; // null leaf의 색은 black
        }
        return n.color == RED;
    }

    // 탐색, 삽입, 삭제 연산
    public Value get(Key key) {
        return get(root, key);
    }

    public Value get(Node node, Key key) {
        if (node == null) {
            return null;
        }
        int t = node.id.compareTo(key); // 비교
        if (t > 0) {
            return get(node.left, key);
        }
        if (t < 0) {
            return get(node.right, key);
        } else {
            return (Value) node.name;
        }
    }

    // LLRB 좌편향 레드 블랙의 삽입 삭제 연산을 위한 세가지 기본 연산
    // 1. 오른쪽 레드링크를 왼쪽으로 옮기기
    // 2. 왼쪽 레드링크를 오른쪽으로 옮기기
    // 3. 노드의 두 링크의 색이 같을 때, 둘 다 다른색으로 바꾸기
    private Node rotateLeft(Node node) {
        Node x = node.right;
        node.right = x.left;
        x.left = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }

    private Node rotateRight(Node node) {
        Node x = node.left;
        node.left = x.right;
        x.right = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }

    private void flipColors(Node node) {
        node.color = !node.color;
        node.left.color = !node.left.color;
        node.right.color = !node.right.color;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
        root.color = BLACK; // root는 무조건 black 이여야 한다.
    }

    public Node put(Node n, Key key, Value value) {
        if (n == null) {
            return new Node(key, value, RED); // 새로운 레드 노드 생성
        }
        int t = key.compareTo((Key) n.id);
        if (t < 0) {
            n.left = put(n.left, key, value);
        } else if (t > 0) {
            n.right = put(n.right, key, value);
        } else {
            n.name = value; // k가 트리에 있는 경우, name에 값 넣기
        }
        if (!isRed(n.left) && !isRed(n.right)) n = rotateLeft(n);
        if (isRed(n.left) && isRed(n.left.left)) n = rotateRight(n);
        if (isRed(n.left) && isRed(n.right)) flipColors(n);
        return n;
    }
    
    // 최소값 삭제 연산
}
