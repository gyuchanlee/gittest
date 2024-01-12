package for_;

import java.io.IOException;

/**
 * 2023-12-22
 */
public class For04 {

    public static void main(String[] args) throws IOException {

        System.out.print("찾을 대문자를 입력 : ");
        int find = System.in.read();
        if (!(find >= 'A' && find <= 'Z')) {
            System.out.println("대문자가 아닙니다!!");
            return;
        }

        // 대문자 난수 100개 발생 및 출력
        int cnt = 0;
        for (int i = 1; i <= 100; i++) {
            int rand = (int) (Math.random() * ('Z' - 'A' + 1) + 'A');
            System.out.print((char) rand + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
            // A 출력 개수 구하기
            if (rand == find) {
                cnt ++;
            }
        }

        System.out.println();
        System.out.println((char) find + "의 개수 : " + cnt);
//        System.out.println("A의 개수 : " + cnt);


    }
}

/**
 * 대문자(A~Z)를 100개 발생하여 출력하시오
 * - 1줄에 10개씩 출력
 * - 100개중에서 A가 몇개 나왔는지 개수를 출력
 *
 * [실행결과]
 * H  D  D  R  A  Y  A  K  T  H
 * C  X  F  Z  B  S  L  Y  Q  D
 * H  K  O  H  O  B  Z  N  J  T
 * U  P  A  P  K  Q  G  W  F  A
 * S  U  D  Z  I  V  J  U  O  G
 * L  M  Z  L  H  U  Y  D  Q  R
 * F  T  I  Z  A  W  E  O  F  Z
 * A  Y  C  I  U  Z  O  B  C  G
 * H  G  Y  Z  V  P  I  R  L  G
 * Y  H  R  R  M  H  Y  S  B  P
 *
 * A의 개수 = 6 (랜듐)
 */
