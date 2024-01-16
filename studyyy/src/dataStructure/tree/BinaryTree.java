package dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<Key extends Comparable<Key>> {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node newRoot) {
        this.root = newRoot;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // preorder(), inorder(), postorder(), levelorder() > 이진 트리 4가지 순회 방식

    // preorder traversal 전위 순회 : 노드를 방문하고 노드의 왼쪽 자식부터 먼저 순회하고 오른쪽 순회. NLR
    public void preorder(Node node) {
        if (node != null) {
            System.out.println(node.getKey() + " "); // 노드 node 방문
            preorder(node.getLeft()); // node의 왼쪽 서브트리를 순회하기 위해 순환 호출
            preorder(node.getRight()); // node의 오른쪽 서브트리를 순회하기 위해 순환 호출
        }
    }

    // Inorder Traversal 중위 순회 : 노드를 방문하지 않고 보류하고 왼쪽 자식부터 순회하고 노드를 방문. 그 후에 오른쪽 방문. LNR.
    public void inorder(Node n) {
        if (n != null) {
            inorder(n.getLeft()); // 왼쪽 서브트리부터 먼저 방문
            System.out.println(n.getKey() + " "); // 노드 본인 방문
            inorder(n.getRight()); // 오른쪽 서브트리 방문
        }
    }

    // Postorder Traversal 후위 순회 : 노드 방문을 보류하고, 왼쪽 서브트리 -> 오른쪽 서브트리를 모두 순회하고 나서야 노드를 방문. LRN.
    public void postorder(Node n) {
        if (n != null) {
            postorder(n.getLeft()); // 1. 왼쪽 서브트리 순회
            postorder(n.getRight()); // 2. 오른쪽 서브트리 순회
            System.out.println(n.getKey() + " "); // 3. 노드 본인 방문
        }
    }

    // levelorder Traversal 레벨 순회 : 루트가 있는 최상위 레벨부터 시작 > 각 레벨마다 좌에서 우로 노드를 방문.
    public void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>(); // 큐 자료구조 이용
        Node t;
        q.add(root); // 루트를 큐에 삽입.
        while (!q.isEmpty()) {
            t = q.remove(); // 큐에 가장 앞에 있는 노드 제거
            System.out.println(t.getKey() + " "); // 제거된 노드 출력(방문 했다침)
            if (t.getLeft() != null) {
                q.add(t.getLeft()); // 큐에 왼쪽 자식 삽입
            }
            if (t.getRight() != null) {
                q.add(t.getRight()); // 큐에 오른쪽 자식 삽입
            }
        }

    }

    // size(), height(), isEqual()

    // size : 트리의 노드 수 > 자기자신 1 + 왼쪽 서브트리 + 오른쪽 서브트리 >> 후위 순회 기반.
    public int size(Node n) {
        if (n == null) {
            return 0;
        } else {
            return (1 + size(n.getLeft()) + size(n.getRight()));
        }
    }

    // height : 트리의 높이 > 1 (루트 자기자신 높이) + max (루트 왼쪽 서브트리 높이와 오른쪽 서브트리 높이 중 높은 것)  >> 후위 순회 기반
    public int height(Node n) {
        if (n == null) {
            return 0;
        } else {
            return (1 + Math.max(height(n.getLeft()), height(n.getRight())));
        }

    }

    // 두 이진트리의 동일성 보장 확인 : 틀린 즉시 연산를 멈춤 > 전위 순회 기반
    public static boolean isEqual(Node n, Node m) {
        if (n == null || m == null) {
            return n == m; // 둘 다 null이여야 true
        }

        if (n.getKey().compareTo(m.getKey()) != 0) {
            return false; // item 비교
        }

        return (isEqual(n.getLeft(), m.getLeft()) && isEqual(n.getRight(), m.getRight()));
        // item이 같으면 왼쪽/오른쪽 자식으로 순환호출하여 계속 비교.
    }
}
