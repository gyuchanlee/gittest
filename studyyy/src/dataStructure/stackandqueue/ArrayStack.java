package dataStructure.stackandqueue;

import java.util.EmptyStackException;

public class ArrayStack <E> { // 배열로 스택 구현

    private E s[]; // 스택을 위한 배열
    private int top; // 스택의 top 항목의 배열 원소 인덱스

    public ArrayStack() {
        s = (E[]) new Object[1]; // 초기 크기가 1인 배열 생성
        top = -1;
    }

    public int size() {
        return top+1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    // peek(), push(), pop(), resize() 메서드 선언
    public E peek() {
        // 스택 top 항목의 내용만을 반환
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return s[top];
    }

    public void push(E newItem) {
        if (size() == s.length) {
            resize(2*s.length); // overflow 발생 시, 배열 크기 늘리기 (배열이 꽉 찬 경우)
        }
        s[++top] = newItem; // 새 항목을 push
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E item = s[top]; // 반환값에 최상위에 위치 한 값 넣기
        s[top--] = null; // 최상위의 값 초기화
        if (size() > 0 && size() == s.length / 4) {
            resize(s.length/2);
        }
        return item;
    }

    private void resize(int newSize) {
        Object[] t = new Object[newSize]; // 새로운 사이즈의 새로운 배열 t 생성
        for (int i = 0; i < s.length; i++) {
            t[i] = s[i]; // 배열 복사
        }
        s = (E[]) t; // 새 배열을 a로 이동
        // 원래 a가 참조하던 배열은 GC가 알아서 처리함.
    }



}
