package multi;

import java.util.Arrays;

/**
 * 2023-12-27
 */
public class MultiArray03 {

    public static void main(String[] args) {

//        int[][] arr1 = new int[4][]; // 가변 길이
//        System.out.println(Arrays.deepToString(arr1));

        int[][] arr = {{1, 2, 3, 0}, {4, 5, 6, 0}, {7, 8, 9, 0}, {0, 0, 0, 0}};
//        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                arr[i][3] += arr[i][j];
                arr[3][i] += arr[j][i];
                arr[3][3] += arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(String.format("%-4d", arr[i][j]));
            }
            System.out.println();
        }

    }
}
