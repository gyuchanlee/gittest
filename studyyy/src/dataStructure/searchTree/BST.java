package dataStructure.searchTree;

public class BST <Key extends Comparable<Key>, Value>{
    public Node root;

    public Node getRoot() {
        return root;
    }

    public BST(Key newId, Value newName) {
        root = new Node(newId, newName);
    }
    
    // get, put, min, deleteMin, delete > 탐색 트리 기본 연산

    // get : 탐색
    public Value get(Key key) {
        return get(root, key);
    }

    // 오버로드
    public Value get(Node n, Key key) {
        if (n == null) {
            return null; // k를 발견 못함
        }
        int t = n.getId().compareTo(key);
        if (t > 0) {
            return get(n.getLeft(), key); // 왼쪽 서브트리 탐색
        } else if (t < 0) {
            return get(n.getRight(), key); // 오른쪽 서브트리 탐색
        } else {
            return (Value) n.getName(); // k를 가진 노드 발견, 탐색 성공.
        }
    }

    // put : 삽입 연산 > 탐색과 동일하지만 마지막에 null이 반환될 상황 대신 그자리에 새 노드를 생성하고 부모와 연결. 이미 존재할때는 name값 변경
    public void put(Key k, Value value) {
        root = put(root, k, value);
    }

    public Node put(Node n, Key k, Value v) {
        if (n == null) {
            return new Node(k, v); // 비어있는곳에 생성
        }
        int t = n.getId().compareTo(k);
        if (t > 0) {
            n.setLeft(put(n.getLeft(), k, v)); // 왼쪽 서브트리에 삽입
        } else if (t < 0) {
            n.setRight(put(n.getRight(), k, v)); // 오른쪽 서브트리에 삽입
        } else {
            n.setName(v); // 노드 n의 name을 v로 갱신
        }
        return n; // 삽입 연산이 완료된 노드 n 반환.
    }

    // min
    public Key min() {
        if (root == null) {
            return null;
        }
        return (Key) min(root).getId();
    }

    public Node min(Node n) {
        if (n.getLeft() == null) {
            return n;
        }
        return min(n.getLeft());
    }

    // 삭제 연산
    public void deleteMin() {
        if (root == null) {
            System.out.println("empty 트리");
        }
        root = deleteMin(root);
    }

    public Node deleteMin(Node n) {
        if (n.getLeft() == null) {
            return n.getRight(); // n의 오른쪽 자식 반환
        }
        n.setLeft(deleteMin(n.getLeft())); // n 왼쪽 자식으로 순환 호출
        return n;
    }

    // 삭제 연산 : 1. 자식이 없는 경우, 2. 자식이 하나인 경우, 3.자식이 둘인 경우를 나누어서 삭제 연산 수행

    public void delete(Key key) {
        root = delete(root, key);
    }

    public Node delete(Node node, Key key) {
        if (node == null) {
            return null;
        }
        int t = node.getId().compareTo(key);
        if (t > 0) {
            node.setLeft(delete(node.getLeft(), key)); // 왼쪽 자식으로 이동
        } else if (t < 0) {
            node.setRight(delete(node.getRight(), key)); // 오른쪽 자식으로 이동
        } else {
            // 삭제할 노드 발견
            if (node.getRight() == null) return node.getLeft(); // case 1, 2
            if (node.getLeft() == null) return node.getRight(); // case 2
            Node target = node; // case 3
            node = min(target.getRight()); // 삭제할 노드 자리로 옮겨올 노드를 찾아서 노드가 가르키가 함.
            node.setRight(deleteMin(target.getRight()));
            node.setLeft(target.getLeft());
        }
        return node;
    }
}
