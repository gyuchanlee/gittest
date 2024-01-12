package while_;

import java.util.Scanner;

/**
 * 2023-12-22
 */
public class Game {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) { // 게임 자체 반복

            System.out.println("1 ~ 100사이의 숫자를 맞추세요!!!");
            System.out.println();

            int com = (int) (Math.random() * 100 + 1); // 난수발생
            int cnt = 0; // 틀린횟수 카운팅

            while (true) { // 게임 내 반복
                // 숫자입력
                System.out.print("숫자 입력 : ");
                int user = scn.nextInt();
                cnt++;

                // 로직
                if (user > com) {
                    System.out.println(user + "보다 작은 숫자 입니다.");
                } else if (user < com) {
                    System.out.println(user + "보다 큰 숫자입니다.");
                } else {
                    System.out.println("정답..." + cnt + "번만에 맞추셨습니다.");
                    System.out.println();
                    break;
                }
            }
            System.out.print("한 번 더(y/n) : ");
            String coin = scn.next();
            if (coin.equals("n") || coin.equals("N")) {
                break;
            }
        }
        System.out.println("종료합니다...");

    }
}

/**
 * [문제] 숫자 맞추기 게임
 * - 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
 * - 몇 번만에 맟주었는지 출력한다.
 *
 * [실행결과]
 * 1 ~ 100사이의 숫자를 맞추세요 (77)
 *
 * 숫자 입력 : 50
 * 50보다 큰 숫자입니다
 * 숫자 입력 : 80
 * 80보다 작은 숫자입니다.
 * ~
 * ~
 * 숫자 입력 : 77
 * 딩동뎅...x번만에 맞추셨습니다.
 *
 * 한 번 더 (y/n) :
 * 종료합니다...
 */