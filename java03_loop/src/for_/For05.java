package for_;

import java.io.IOException;

/**
 * 2023-12-22
 */
public class For05 {

    public static void main(String[] args) throws IOException {

        System.out.print("x : ");
        int x = System.in.read() - '0';
        System.in.read(); // \r,\n 받아주기.
        System.out.print("y : ");
        int y = System.in.read() - '0';
        int mul = 1;

        for (int i = 1; i <= y; i++) {
            mul *= x;
        }

        System.out.println(x + "의 " + y + "승 " + mul);
    }
}

/**
 * [문제] x의 y승을 구하시오 (for)
 *
 * [실행결과]
 * x : 2
 * y : 5
 * 2의 5승 xx
 */
