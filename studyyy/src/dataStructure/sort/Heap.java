package dataStructure.sort;

public class Heap {
    /**
     * 힙 정렬
     * - 최대 힙을 활용하여 정렬
     * - 루트와 마지막 노드부터 교환 & 힙의 크기 1 감소.
     * - 위배된 힙 속성은 downheap연산으로 복원 > 루트와 자식의 비교 중 승자와 교환
     * - 이러한 수행을 반복하여 힙의 크기가 1이 될 때 정렬 완료.
     */

    public static void sort(Comparable[] a) {
        int heapSize = a.length - 1; // a[0]은 사용 안함.
        for (int i = heapSize / 2; i > 0; i--) { // 힙 만들기
            downHeap(a, i, heapSize);
        }
        while (heapSize > 1) { // 힙 정렬
            swap(a, 1, heapSize); // a[1]가 힙의 마지막 항목과 교환
            downHeap(a, 1, heapSize); // 위배된 힙속성 고치기
        }
    }

    private static void downHeap(Comparable[] a, int p, int heapSize) {
        while (2 * p <= heapSize) {
            int s = 2*p; // s = 왼쪽자식 인덱스
            if (s < heapSize && isless(a[s],a[s+1])) s++; // 오른쪽 자식이 큰 경우
            if (!isless(a[p],a[s])) break; // 힙 속성 만족하는 경우
            swap(a, p, s); // 힙 속성을 만족 안하면 부모(p)와 자식 승자(s)를 교환
            p = s; // 자식 승자 자리에 p가 들어감.
        }
    }

    private static void swap(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean isless(Comparable i, Comparable j) {
        return (i.compareTo(j) < 0);
    }

}
