package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2024-01-09
 */
public class ExceptionMain2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        try {

            System.out.print("x 입력 : ");
            int x = scn.nextInt();
            System.out.print("y 입력 : ");
            int y = scn.nextInt();

            int result = 1;
            for (int i = 1; i <= y; i++) {
                result *= x;
            }

            if (y < 0) {
                System.out.println("y는 0보다 작으면 안됩니다");
//                throw new IllegalArgumentException("y는 0이상이여야 합니다");
                throw new MakeException("메시지에요");
            }

            System.out.println(x + "의 " + y + "승은 " + result);
        } catch (InputMismatchException e) {
            System.out.println("제대로 입력하기");
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("던진 예외 잡기");
            e.printStackTrace();
        } catch (MakeException e) {
            System.out.println("사용자 커스텀 예외 사용");
            e.printStackTrace();
        } finally {
            scn.close();
        }
    }
}

/**
 * [문제] 제곱 연산
 * - x의 y승을 처리 한다.
 *
 * [실행결과]
 * x 입력 : 2
 * y 입력 : 10			input()
 * ----------------------------------
 * 2의 10승은 xxx        output()
 */