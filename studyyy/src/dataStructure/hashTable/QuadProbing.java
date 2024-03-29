package dataStructure.hashTable;

public class QuadProbing <K, V>{
    // 해시테이블 개방 주소 방식 > 이차 조사 (해시 충돌 해결 방법)
    // 점프 시퀀스, 2차 군집화 발생
    private int M = 13; // 테이블 크기
    private K[] a =(K[]) new Object[M]; // 해시 테이블
    private V[] d =(V[]) new Object[M]; // key 관련 데이터 저장

    private int hash(K key) { // 해시 함수
        return (key.hashCode() & 0x7fffffff) % M; // 나눗셈 함수
    }

    // 삽입 연산
    public void put(K key, V data) {
        int initialpos = hash(key);
        int i = initialpos, j = 1, loop_limit = 20; // 저장 시도 횟수 제한
        do {
            if (a[i] == null) {
                // 삽입 위치 발견
                a[i] = key;
                d[i] = data;
                return;
            }
            if (a[i].equals(key)) {
                d[i] = data; // 이미 값이 존재할때 갱신만.
            }
            i = (initialpos + j * j++) % M;
            loop_limit -= 1;
        } while (loop_limit > 0);
        System.out.println("저장 실패!!");
    }

}
