package dataStructure.stackandqueue;

import java.util.EmptyStackException;

public class ListStack <E>{ // 단순 연결 리스트로 스택 구현

    private Node<E> top; // 스택의 top 항목을 가진 Node를 가리키기 위함
    private int size;

    public ListStack() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // peek, push, pop 구현

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getItem();
    }

    public void push(E newItem) {
        Node newNode = new Node(newItem, top); // 리스트 앞부분에 삽입
        top = newNode; // top이 새 노드를 가리키도록.
        size++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E topItem = top.getItem(); // 스택 top 항목을 topItem에 저장
        top = top.getNext(); // top이 바로 아래 항목을 가리킴
        size--;
        return topItem;
    }
}
