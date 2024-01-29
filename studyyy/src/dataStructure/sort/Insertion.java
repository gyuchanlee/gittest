package dataStructure.sort;

public class Insertion {
    /**
     * 삽입 정렬
     * 1. 정렬된 부분, 정렬 안된 부분으로 나뉨
     * 2. 정렬 안된 부분의 가장 왼쪽 원소 -> 정렬된 부분에 비교하며 올바른 위치에 삽입.
     */

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) { // i = 현재 원소의 인덱스
            for (int j = i; j > 0; j--) { // 현재 원소를 정렬된 앞부분에 삽입
                if (isless(a[j], a[j - 1])) {
                    swap(a, j, j-1);
                } else {
                    break;
                }
            }

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
