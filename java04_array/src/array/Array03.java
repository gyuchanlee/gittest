package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2023-12-26
 */
public class Array03 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("배열 크기 입력 : ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] 입력 : ");
            arr[i] = scn.nextInt();
            sum += arr[i];
        }

        System.out.println();
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("합 = " + sum);

    }
}

/**
 * [실행 결과]
 * 배열 크기 입력 : 3
 * arr[0] 입력 : 25
 * arr[1] 입력 : 12
 * arr[2] 입력 : 37
 *
 * 25 12 37
 * 합 = xxx
 */