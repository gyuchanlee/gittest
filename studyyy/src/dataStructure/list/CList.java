package dataStructure.list;

public class CList<E> {

    private Node last; // 리스트의 마지막 노드를 가리킴.
    private int size;

    public CList() {
        last = null;
        size = 0;
    }

    // 삽입, 삭제 연산 메서드
    public void insert(E newItem) {
        Node newNode = new Node(newItem, null);
        if (last == null) {
            // list is empty
            newNode.setNext(newNode);
            last = newNode;
        } else {
            // list is not empty
            newNode.setNext(last.getNext()); // 새로운 노드의 다음 노드가 last가 가리키는 노드의 다음 노드가 되도록 함.
            last.setNext(newNode); // last가 가리키는 노드의 다음 노드가 새 노드가 되도록 함.
            // 즉 끝부분에 새로운 요소가 추가된 것과 같음.
        }
        size++;
    }

    // 삭제
    public Node delete() {

        Node x = last.getNext(); // x가 리스트의 첫 노드를 가리킴
        if (x == last) {
            // 마지막이 계속 자기를 참조한다 > 리스트에 한개의 노드만 있다
            last = null;
        } else {
            last.setNext(x.getNext()); // last가 가르키는 노드가 원래 x의 다음 노드가 되도록 함. (x를 바라보는 연결 끊기)
            x.setNext(null); // x의 다음 연결 끊기 > 모든 연결 끊기
        }
        size--;
        return x;
    }
}
