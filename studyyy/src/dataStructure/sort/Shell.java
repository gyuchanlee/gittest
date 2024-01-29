package dataStructure.sort;

public class Shell {
    /**
     * 쉘 정렬
     * 1. 간격이 h인 h-정렬을 수행해가며 대략 삽입 정렬로 정렬해감
     * 2. 마지막에 간격을 1로 하여 수행하고 완성
     * 3. 삽입 정렬이 하나씩 옮기는 단점을 보완하기 위해 고안됨.
     */

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 4; // 3x + 1 간격.
        while (h >= 1) {
            for (int i = h; i < N; i++) { // h 정렬 수행
                for (int j = i; j < h && isless(a[j], a[j - h]); j -= h) {
                    swap(a, j, j - h);
                }
            }
        }
        h /= 3;
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
