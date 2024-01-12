package homework;

import java.util.Scanner;

/**
 * 2023-12-22
 * 수정 : 2023-12-26
 */
public class AddGame {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("덧셈 계산 게임");
        System.out.println();

        while (true) { // 게임 플레이 시작

            int score = 0; // 점수
            int correct = 0; // 맞춘 개수
            String yn = "";

            for (int i = 0; i < 5; i++) {
                // 문제 난수, 정답 생성
                int rand1 = (int) (Math.random() * (99 - 10 + 1) + 10);
                int rand2 = (int) (Math.random() * (99 - 10 + 1) + 10);
                int answer = rand1 + rand2;

                // 두번 답안 제출 기회 제공
                for (int j = 0; j < 2; j++) {
                    System.out.printf("[%d] %d + %d = ", (i + 1), rand1, rand2);
                    int user = scn.nextInt();
                    if (user == answer) {
                        System.out.println("딩동댕");
                        correct++;
                        break;
                    } else if (user != answer && j < 1) {
                        System.out.println("틀렸다");
                    } else {
                        System.out.println("틀렸다 정답은 " + answer);
                    }
                }
            }

            score = correct * 20;
            System.out.println("당신은 총 " + correct + " 문제를 맞추어서 점수 " + score + "점 입니다.");

            while (!yn.equals("y") && !yn.equals("n") && !yn.equals("Y") && !yn.equals("N")) {
                System.out.print("또 할래(Y/N) : ");
                yn = scn.next();
            }
            if (yn.equals("n") || yn.equals("N")) {
                System.out.println("프로그램을 종료합니다.");
                System.out.println();
                break;
            }

        }

    }
}

/**
 * [문제] 덧셈 계산 (for, while, 다중 for)
 * - 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
 * - 5문제를 제공한다.
 * - 1문제당 점수 20점씩 처리한다.
 * - 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.
 *
 * [실행결과]
 * [1] 25 + 36 = 50
 * 틀렸다
 * [1] 25 + 36 = 59
 * 틀렸다 정답은 xx
 *
 * [2] 10 + 25 = 35
 * 딩동뎅
 *
 * [5] 78 + 95 = 89
 * 틀렸다
 * [5] 78 + 95 = 173
 * 딩동뎅
 *
 * 당신은 총 x 문제를 맞추어서 점수 xx점 입니다.
 *
 * 또 할래(Y/N) : a
 * 또 할래(Y/N) : w
 * 또 할래(Y/N) : n
 *
 * 프로그램을 종료합니다.
 *
 * * 게임 자체 반복 -> while
 * 5문제반복, 2번 기회줌 -> 다중 for문
 */