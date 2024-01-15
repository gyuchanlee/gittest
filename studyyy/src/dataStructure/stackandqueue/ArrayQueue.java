package dataStructure.stackandqueue;

import java.util.NoSuchElementException;

public class ArrayQueue<E> {
    private E[] q; // 큐를 위한 배열
    private int front, rear, size;

    public ArrayQueue() {
        q = (E[]) new Object[2]; // 초기 크기가 2인 배열 생성
        front = rear = size = 0;
    }

    // 큐에 있는 항목의 수 반환
    public int size() {
        return size;
    }

    // 큐가 empty면 true
    public boolean isEmpty() {
        return (size == 0);
    }

    // add(), remove(), resize()

    public void add(E newItem) {
        if ((rear + 1) % q.length == front) {
            // 빈 원소가 한개뿐 >> 큐가 full
            resize(2*q.length); // 큐 크기 2배 확장
        }
        rear = (rear + 1) % q.length;
        q[rear] = newItem; // 새항목 추가
        size++;
    }

    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        front = (front + 1) % q.length;
        E item = q[front];
        q[front] = null; // null처리해서 GC 수행.
        size--;
        if (size > 0 && size == q.length / 4) {
            // 큐의 항목수가 배열 크기의 4분의1이면
            resize(q.length / 2); // 큐 길이 1/2 축소
        }
        return item;
    }

    private void resize(int newSize) {
        Object[] t = new Object[newSize];
        for (int i = 1, j = front + 1; i < size + 1; i++, j++) {
            t[i] = q[j % q.length];
        }
        front = 0;
        rear = size;
        q = (E[]) t;
    }
}
