package dataStructure.sort;

public class BucketSort {
    /**
     * 버킷 정렬 - LSD 기수 정렬에서 활용
     * <p>
     * 1. 입력 배열에서 각 숫자의 빈도수를 계산해 버킷 배열에 저장
     * 2. 버킷 인덱스 0부터 차례로 빈도수만큼 배열에 복사.
     */

    public static void sort(int[] a, int R) {
        int[] bucket = new int[R];
        for (int i = 0; i < R; i++) {
            bucket[i] = 0;
        } // 초기화
        for (int i = 0; i < a.length; i++) {
            bucket[a[i]]++; // 1단계 빈도수 계산
        }
        // 2단계 순차적으로 버킷의 인덱스를 배열 a에 저장
        int j = 0; // 다음 저장될 배열 a 원소의 인덱스
        for (int i = 0; i < R; i++) {
            while ((bucket[i]--) != 0) { // 버킷 i에 저장된 빈도수가 0이 될 때까지.
                a[j++] = i; // 버킷 인덱스 i를 저장.
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 0, 5, 0, 3, 2, 5, 2, 3, 1, 0, 2};
        sort(a, 10);
        System.out.println("정렬 결과 : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "\t");
        }
    }
}
