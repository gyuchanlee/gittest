package dataStructure.sort;

public class Merge {
    /**
     * 합병 정렬
     * - 입력 n을 n/2로 두개로 나누어 각각 순환으로 합병 정렬을 수행한 후, 정렬된 부분을 합치어 정렬하는 알고리즘.
     */

    private static void merge(Comparable[] a, Comparable[] b, int low, int mid, int high) {
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                b[k] = a[j++]; // 앞부분이 먼저 소진된 경우
            } else if (j > high) {
                b[k] = a[i++]; // 뒷부분이 먼저 소진된 경우
            } else if (isless(a[j], a[i])) {
                b[k] = a[j++]; //a[j]가 승자
            } else {
                b[k] = a[i++]; //a[i]가 승자
            }
        }
        for (int k = low; k <= high; k++) {
            a[k] = b[k]; // 보조 배열 b를 a에 복사
        }
    }

    private static void sort(Comparable[] a, Comparable[] b, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(a, b, low, mid); // 앞부분 순환 호출
        sort(a, b, mid + 1, high); // 뒷부분 순환 호출
        merge(a, b, low, mid, high); // 합병 수행
    }

    public static void sort(Comparable[] a) {
        Comparable[] b = new Comparable[a.length];
        sort(a, b, 0, a.length);
    }

    private static boolean isless(Comparable i, Comparable j) {
        return (i.compareTo(j) < 0);
    }
}
