package array;

/**
 * 2023-12-26
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {35, 48, 25, 72, 50};

        System.out.print("정렬 전 : ");
        for (int data : arr) {
            System.out.print(data + "\t");
        }
        System.out.println();

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("정렬 후 : ");
        for (int data : arr) {
            System.out.print(data + "\t");
        }
        System.out.println();
    }
}

/**
 * 정렬
 * - 오름차순 : ASC
 * - 내림차순 : DESC
 *
 * Selection sort : 선택 정렬
 * 시간 정렬도 n제곱이므로 간단하지만 비효율적.
 * 교환 횟수는 O(n)으로 적지만, 비교는 모두 진행된다.
 * 즉, 버블 정렬보다는 성능이 좋다.
 */