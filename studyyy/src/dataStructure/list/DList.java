package dataStructure.list;

import java.util.NoSuchElementException;

public class DList<E> {
    protected DNode head, tail;
    protected int size;

    public DList() {
        // 실제로 항목을 저장하기 위한 것이 아님 : dummy 노드
        head = new DNode(null, null, null);
        tail = new DNode(null,  head, null);
        head.setNext(tail); // 처음에는 무조건 head다음 tail이 다음 노드.
        size = 0;
    }

    // 삽입, 삭제 연산 메서드
    public void insertBefore(DNode p, E newItem) {
        // p가 가리키는 노드 앞에 삽입
        DNode t = p.getPrevious();
        DNode newNode = new DNode(newItem, t, p); // p와 p의 앞의 노드(t) 사이에 넣을 새 노드.
        p.setPrevious(newNode);
        t.setNext(newNode);
        size++;
    }

    public void insertAfter(DNode p, E newItem) {
        // p가 가리키는 노드 뒤에 삽입
        DNode t = p.getNext();
        DNode newNode = new DNode(newItem, p, t); // 새노드에 p와 t가 가르키는 노드들 연결
        t.setPrevious(newNode); // t에서 새노드 가리키도록 연결
        p.setNext(newNode); // p에서 새노드를 가리키도록 연결
        size++;
    }

    // 인자로 주어진 x노드 삭제 메서드
    public void delete(DNode x) {
        if (x == null) {
            throw new NoSuchElementException();
        }
        DNode f = x.getPrevious();
        DNode r = x.getNext();
        // x노드 삭제 후, 연결되어 있던 두 레퍼런스 변경
        f.setNext(r);
        r.setPrevious(f);
        size--;
    }

}
