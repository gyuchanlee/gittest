package dataStructure.list;

import java.util.NoSuchElementException;

public class ArrList<E> {
    private E a[]; // 리스트 항목을 저장할 배열
    private int size; // 리스트의 항목 수

    public ArrList() {
        a = (E[]) new Object[1]; // 최초로 크기가 1인 배열 생성
        size = 0; // 항목 수 0으로 초기화
    }

    // 접근
    public E peek(int k) {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return a[k];
    }

    // 삽입 연산
    public void insertLast(E newItem) {
        if (size == a.length) {
            resize(2 * a.length);
            a[size++] = newItem;
        }
    }

    public void insert(E newItem, int k) {
        // 빈공간이 없다면 공간확장
        if (size == a.length) {
            resize(2 * a.length);
        }
        // 한칸 씩 뒤로 이동
        for (int i = size - 1; i >= k; i--) {
            a[i + 1] = a[i];
        }
        a[k] = newItem;
        size++;
    }

    private void resize(int newSize) {
        Object[] t = new Object[newSize]; // 새로운 사이즈의 새로운 배열 t 생성
        for (int i = 0; i < size; i++) {
            t[i] = a[i]; // 배열 복사
        }
        a = (E[]) t; // 새 배열을 a로 이동
        // 원래 a가 참조하던 배열은 GC가 알아서 처리함.
    }

    public E delete(int k) {
        if (a == null) {
            throw new NoSuchElementException();
        }
        E item = a[k];
        for (int i = k; i < size; i++) {
            a[i] = a[i + 1]; // 1칸씩 앞으로 이동
        }
        size--;

        if (size > 0 && size == a.length / 4) { // 배열에 항목들이 1/4만 차지할 시,
            resize(a.length / 2); // 배열 반틈 축소
        }
        return item;
    }

}
