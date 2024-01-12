package array;

/**
 * 2023-12-27
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {35, 48, 25, 72, 50};

        System.out.print("정렬 전 : ");
        for (int data : arr) {
            System.out.print(data + "\t");
        }
        System.out.println();


        // 버블 정렬
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
 * 버블 소트
 *
 * 비교와 교환이 모두 일어날 수 있음.
 * 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘
 * 인접한 두 개의 레코드를 비교하여 순서가 맞지 않으면 서로 교환하는 방식
 * 1회전을 수행하고 나면 가장 큰 자료가 맨 뒤로 이동하므로 2회전에서는 맨 끝에 있는 자료는 정렬에서 제외한다.
 * 이렇게 정렬을 1회전 수행할 때마다 정렬에서 제외되는 데이터가 하나 씩 증가한다.
 *
 * 시간복잡도 n제곱이므로 간단한 로직에 많이 사용 > 실제 큰 리스트에는 다른 정렬 적용하는게 좋음.
 */