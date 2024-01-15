package dataStructure.stackandqueue;

import java.util.NoSuchElementException;

public class ListQueue<E> {

    private Node<E> front, rear;
    private int size;

    public ListQueue() {
        front = rear = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    // add, remove
    public void add(E newItem) {
        Node newNode = new Node(newItem, null); // 새 노드 생성
        if (isEmpty()) front = newNode; // 비어있는 큐면 front가 새 노드 가르키도록 함
        else rear.setNext(newNode); // 아니라면 rear의 다음이 새 노드를 가르키도록 함
        rear = newNode; // rear가 새 노드를 가르키도록 함
        size++;
    }

    public E remove() {
        if (isEmpty()) throw new NoSuchElementException();
        E frontItem = front.getItem(); // 삭제할 프론트 노드 가져오기
        front = front.getNext(); // front가 다음 노드를 가르키게 함
        if (isEmpty()) rear = null; // 빈 큐라면 끝부분에 null.
        size--;
        return frontItem;
    }
}
