package dataStructure.priorityQueue.binaryHeap;

public class BHeap<Key extends Comparable<Key>, Value> {
    private Entry[] a; // a[0]은 사용안함
    private int N; // 힙의 크기, 힙의 항목수

    public BHeap(Entry[] harray, int initialSize) {
        this.a = harray;
        N = initialSize;
    }

    public int size() {
        return N;
    }

    private boolean greater(int i, int j) {
        // 키 비교
        return a[i].getKey().compareTo(a[j].getKey()) > 0;
    }

    private void swap(int i, int j) {
        Entry temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // 초기 힙 만들기
    public  void createHeap() {
        // 초기 힙 만들기
        for (int i = N / 2; i > 0; i--) {
            downHeap(i);
        }
    }

    private void downHeap(int i) {
        while (2 * i <= N) {
            // i의 왼쪽 자식이 힙에 있으면
            int k = 2*i; // k = 왼쪽 자식 인덱스
            if (k < N && greater(k, k + 1)) {
                k++;
            }
            if (!greater(i, k)) {
                // 현재 노드가 자식 승자와 같거나 작으면 루프 중단
                break;
            }
            swap(i, k); // 현재 노드가 자식 승자보다 크면 교환.
            i = k; // 자식 승자가 현재 노드가 되어 다시 반복
        }
    }
}
