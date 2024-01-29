package dataStructure.sort;

public class Quick {
    /**
     * 퀵 정렬
     * 1. 맨 왼쪽 원소를 피벗 지정 > 피벗을 기준으로 피벗보다 작은 것은 왼쪽, 피벗보다 큰 것은 오른쪽으로 각각 좌우 분할 수행
     * 2. 분할된 원소들을 각각 같은 방법으로 정렬
     */

    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int low, int high) {
        if (high <= low) return;
        int j = partition(a, low, high);
        sort(a, low, j - 1); // 피벗보다 작은 부분을 순환 호출
        sort(a, j + 1, high); // 피벗보다 큰 부분을 순환 호출
    }

    private static int partition(Comparable[] a, int pivot, int high) {
        int i = pivot;
        int j = high + 1;
        Comparable p = a[pivot];
        while (true) {
            while (isless(a[++i], p)) {
                if (i == high) {
                    break; // 피벗보다 작으면
                }
            }
            while (isless(p, a[--j])) {
                if (j == pivot) {
                    break; // 피벗보다 크면
                }
            }
            if (i >= j) {
                break; // i와 j가 교차하면 루프 나가기
            }
            swap(a, i, j);
        }
        swap(a, pivot, j); // 피벗과 a[j] 교환
        return j; // a[j]의 피벗이 영원히 자리 잡은 곳 리턴.
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
