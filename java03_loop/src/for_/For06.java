package for_;

import java.util.Scanner;

/**
 * 2023-12-22
 */
public class For06 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int result;

        while (true) { // 프로그램 무한반복
            // 입력
            System.out.print("숫자 입력 : ");
            int factorial = scn.nextInt();
            // 입력값 검사
            if (factorial < 0 || factorial > 10) {
                continue;
            } else if (factorial == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 처리
            result = 1;

            for (int i = 2; i <= factorial; i++) {
                result *= i;
            }
            // 출력
            System.out.println(factorial + "! = " + result);
            System.out.println();
        }

        scn.close(); // 자원 반납.

    }
}

/**
 * [문제] 팩토리얼을 구하시오
 * - 음수가 입력되면 다시 입력을 받는다.
 * - 0이 입력되면 프로그램을 종료한다.
 * - 숫자는 1부터 10까지만 입력한다.
 *
 * [실행결과]
 * 숫자 입력 : 3
 * 3! = 6 (123)
 *
 * 숫자 입력 : -3
 * 숫자 입력 : -5
 * 숫자 입력 : 5
 * 5! = 120
 *
 * 숫자 입력 : 0
 * 프로그램을 종료합니다.
 *
 */