package array;

/**
 * 2023-12-26
 */
public class Array04 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int max;
        int min;

        // 난수 & 배열 생성 및 출력
        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * 100 + 1);
            arr[i] = rand;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // 최대값 & 최소값 출력
        max = arr[0];
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("최대값 = "+ max);
        System.out.println("최소값 = "+ min);

    }
}

/**
 * [문제] 1 - 100 난수 발생하여 배열에 저장 후, 데이터를 출력하고, 최대값과 최소값 구하기.
 *
 * [실행 결과]
 * 87	58	6	87	40	74	86	7	54	56
 * 최대값 = 87
 * 최소값 = 6
 */