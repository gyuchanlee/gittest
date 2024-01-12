package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2023-12-26
 */
public class Lotto {

    public static void main(String[] args) {
        int[] lotto = new int[6];

        // 현금 투입
        Scanner scn = new Scanner(System.in);
        System.out.print("현금 투입 : ");
        int money = scn.nextInt();

        for (int k = 1; k <= (money / 1000); k++) {

            // 난수 발생
            for (int i = 0; i < lotto.length; i++) {
                int rand = (int) (Math.random() * 45 + 1);
                lotto[i] = rand;

                // 중복비교
                for (int j = 0; j < i; j++) {
                    if (lotto[i] == lotto[j]) {
                        i--;
                        break; // 중복비교 수행했으면 for문을 중지해서 자원 세이브.
                        // 난수가 겹쳤으니 for i를 다시 수행하게 하기 (난수가 안겹치면 그대로 증감해서 지나감)
                    }
                }
            }

            // 선택 정렬
            int temp;
            for (int i = 0; i < lotto.length - 1; i++) {
                for (int j = i + 1; j < lotto.length; j++) {
                    if (lotto[i] > lotto[j]) {
                        temp = lotto[i];
                        lotto[i] = lotto[j];
                        lotto[j] = temp;
                    }
                }
            }

            // 출력
            for (int i = 0; i < lotto.length; i++) {
                System.out.printf(String.format("%-4d", lotto[i]));
            }
            System.out.println();
            if (k % 5 == 0) {
                System.out.println();
            }
        }


    }
}

/**
 *  [문제] 로또 프로그램
 *  1 ~ 45 사이의 난수가 6개 발생. 단, 숫자는 중복 불가.
 *  1줄당 금액이 천원.
 *  1종이당 5줄씩 출력하고, 그다음 줄은 다음 종이로(라인) 넘김.
 *  선택 정렬로 정렬하기.
 *
 * [실행결과]
 * 현금 입력 : 3000
 *     2    4   19   39   43   44
 *    22   26   33   38   39   42
 *     5    6    8   25   35   45
 *
 * 현금 입력 : 7000
 *    2    4   19   39   43   44
 *    22   26   33   38   39   42
 *     5    6    8   25   35   45
 *     3   14   23   30   34   35
 *    18   20   25   27   32   37
 *
 *     1   16   32   34   41   42
 *     5    6   18   30   33   44
 */