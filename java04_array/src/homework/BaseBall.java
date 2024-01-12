package homework;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 2023-12-27
 */
public class BaseBall {

    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);
        String start = "";

        while (!(start.equals("y") || start.equals("Y") || start.equals("n") || start.equals("N"))) {
            System.out.print("게임을 실행하시겠습니까(Y/N) : ");
            start = scn.next();
        }
        if (start.equals("n") || start.equals("N")) {
            System.out.println("프로그램을 종료합니다.");
            return;
        }

        int strike = 0;
        int ball = 0;
        int[] com = new int[3];
        int[] user = new int[3];

        for (int i = 0; i < com.length; i++) {
            int rand = (int) (Math.random() * 9 + 1);
            com[i] = rand;

            // 중복 체크
            for (int j = 0; j < i; j++) {
                if (com[i] == com[j]) {
                    i--;
                }
            }
        }

//        System.out.println("컴퓨터 숫자 : " + Arrays.toString(com));

        while (true) {
            System.out.print("숫자입력 : ");
//            String answer = scn.next();
            for (int i = 0; i < 3; i++) {
//                user[i] = answer.charAt(i) - '0';
                user[i] = System.in.read() - '0';
            }

//            System.out.println("유저 숫자 : " + Arrays.toString(user));

            // 스트라이크 볼 로직
            for (int i = 0; i < com.length; i++) {
                for (int j = 0; j < user.length; j++) {
                    if (com[i] == user[j] && i == j) {
                        strike++;
                    } else if (com[i] == user[j]) {
                        ball++;
                    }
                }
            }

            System.out.println(strike + "스트라이크 " + ball + "볼");

            if (strike == 3) {
                System.out.println("삼 진 아 웃");
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            strike = 0;
            ball = 0;
        }

    }
}

/**
 * [문제] 야구게임
 * 크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
 * 발생한 수를 맞추는 게임
 * 중복은 제거한다
 *
 * [실행결과]
 * 게임을 실행하시겠습니까(Y/N) : w
 * 게임을 실행하시겠습니까(Y/N) : u
 * 게임을 실행하시겠습니까(Y/N) : y
 *
 * 게임을 시작합니다
 *
 * 숫자입력 : 123
 * 0스트라이크 0볼
 *
 * 숫자입력 : 567
 * 0스트라이크 2볼
 *
 * 숫자입력 : 758
 * 1스트라이크 2볼
 * ...
 *
 * 숫자입력 : 785
 * 3스트라이크 0볼
 *
 * 프로그램을 종료합니다.
 */