package if_;

import java.util.Scanner;

/**
 * 2023-12-21
 */
public class If03 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("a의 값 : ");
        int a = scn.nextInt();
        System.out.print("b의 값 : ");
        int b = scn.nextInt();
        System.out.print("c의 값 : ");
        int c = scn.nextInt();

        // a가 가장 클 때, c가 가장 클 때, b가 가장 클 때를 각각 가정해서 조건으로 잡음. (모든 경우의수 3!)
        if (a > b && a > c && b > c) {
            System.out.printf("%d %d %d\n", c, b, a);
        } else if (a > c && b < c) {
            System.out.printf("%d %d %d\n", b, c, a);
        } else if (c > a && c > b && a > b) {
            System.out.printf("%d %d %d\n", b, a, c);
        } else if (c > b && a < b) {
            System.out.printf("%d %d %d\n", a, b, c);
        } else if (b > a && b > c && a > c) {
            System.out.printf("%d %d %d\n", c, a, b);
        } else { // 맨 마지막은 하나의 경우의 수만 남음.
            System.out.printf("%d %d %d\n", a, c, b);
        }

    }
}

/**
 *  3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오 (if문 사용하시오)
 *
 * [실행결과]
 * a의 값 : 98
 * b의 값 : 90
 * c의 값 : 85
 *
 * 85 90 98
 *
 * a의 값 : 75
 * b의 값 : 25
 * c의 값 : 36
 *
 * 25 36 75
 */