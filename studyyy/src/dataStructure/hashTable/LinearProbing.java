package dataStructure.hashTable;

public class LinearProbing <K, V>{
    // 해시테이블 개방 주소 방식 > 선형 조사 (해시 충돌 해결 방법)
    private int M = 13; // 테이블 크기
    private K[] a =(K[]) new Object[M]; // 해시 테이블
    private V[] d =(V[]) new Object[M]; // key 관련 데이터 저장

    private int hash(K key) { // 해시 함수
        return (key.hashCode() & 0x7fffffff) % M; // 나눗셈 함수
    }

    // 삽입 연산
    private void put(K key, V data) {
        int initialpos = hash(key); // 초기 위치
        int i = initialpos, j = 1;
        do {
            if (a[i] == null) {
                // 삽입 위치 발견
                a[i] = key; // 키를 해시테이블에 저장
                d[i] = data; // key 관련 데이터를 동일한 인덱스에 저장
                return;
            }
            if (a[i].equals(key)) {
                // 이미 키가 존재
                d[i] = data; // 데이터만 갱신
                return;
            }
            i = (initialpos + j++) % M; // i 다음 위치 구하기
        } while (i != initialpos); // 현재 i가 최기 위치와 같으면 루프 종료.
        System.out.println("저장 실패!!!");
    }

    // 탐색 연산
    public V get(K key) {
        int initialpos = hash(key);
        int i = initialpos, j = 1;
        while (a[i] != null) {
            // a[i]가 empty가 아니면
            if (a[i].equals(key)) {
                return d[i]; // 탐색 성공
            }
            i = (initialpos + j++) % M; // i = 다음 위치
        }
        return null;
    }
}
