package array;

import java.util.Arrays;

/**
 * 2023-12-26
 */
public class Array01 {

    public static void main(String[] args) {
        /**
         * Array (배열)
         * - 선언 시에 크기를 미리 지정하고 생성
         * - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것 > 연속적
         *
         * * Linked List
         * - 포인터 주소를 참조하여 다음 값을 찾아감
         * - 각기 노드마다 화살표로 연결되어 리스트 형태로 나열 (노드 == 하나의 객체)
         * - 삽입 / 삭제 처리 속도가 빠르다 && 공간의 제약이 존재하지 않음
         * - 메모리를 상대적으로 많이 씀.
         */

        int[] arr; // 배열 선언
        arr = new int[5]; // 초기화 (메모리 생성)

        arr[0] = 25;
        arr[1] = 43;
        arr[2] = 30;
        arr[3] = 27;
        arr[4] = 52;

        System.out.println("배열 arr = " + Arrays.toString(arr));
        System.out.println("배열 크기 = " + arr.length);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]" + " = " + arr[i]);
        }
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("arr[" + i + "]" + " = " + arr[i]);
        }
        System.out.println();

        System.out.println("홀수 데이터만 출력");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("arr[" + i + "]" + " = " + arr[i]);
            }
        }
        System.out.println();

        System.out.println("확장 for문 : 직접 배열 or 컬렉션에 접근하여 요소를 바로 뽑아냄.");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();



    }
}
