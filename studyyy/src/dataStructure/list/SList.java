package dataStructure.list;

import java.util.NoSuchElementException;

public class SList<E> {

    protected Node head; // 연결 리스트의 첫 노드를 가르킴
    private int size;

    public SList() {
        this.head = null;
        this.size = 0;
    }

    // 탐색
    public int search(E target) {
        Node p = head;
        for (int k = 0; k < size; k++) {
            if (p.getItem() == target) {
                return k; // 탐색 성공
            }
            p = p.getNext();
        }
        return -1; // 탐색 실패 시 -1 반환.
    }

    // 새 항목 연결 리스트 맨 앞에 삽입하는 경우
    public void insertFront(E newItem) {
        head = new Node(newItem, head);
        size++;
    }

    // p가 가리키는 노드에 삽입하는 경우
    public void insertAfter(E newItem, Node p) {
        p.setNext(new Node(newItem, p.getNext()));
        size++;
    }

    // 첫 노드 삭제
    public void deleteFront() {
        head = head.getNext();
        size--;
    }

    // p가 가리키는 노드의 다음 노드 삭제
    public void deleteAfter(Node p) {
        if (p == null) {
            throw new NoSuchElementException();
        }
        Node t = p.getNext();
        p.setNext(t.getNext());
        t.setNext(null);
        size--;
    }

}
