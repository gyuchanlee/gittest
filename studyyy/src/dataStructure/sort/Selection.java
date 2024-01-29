package dataStructure.sort;

public class Selection {
    /** 선택정렬
     * 최소값을 선택하여 정렬된 부분의 바로 오른쪽 원소와 교환해가는 정렬
     */
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (isless(a[j], a[min])) {
                    min = j;
                }
                swap(a, i, min);
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
