package homework;

import java.io.IOException;
import java.util.Scanner;

/**
 * 2023-12-22
 * 수정 : 2023-12-26
 */
public class RSPGame {

    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);
        int money = 1000; // 초기 시드머니

        while (true) {
            int rand = (int) (Math.random() * 3 + 1); // 가위바위보 난수
            String yn = ""; // 계속할지 판단

//            System.out.println("당신의 보유 금액 : " + money);
//            System.out.print("배팅 금액 : ");
//            int batting = scn.nextInt();
//            if (batting > money) {
//                System.out.println("그만큼 배팅 못해요");
//                continue;
//            }

            int batting = 0;
            do {
                System.out.println("당신의 보유 금액 : " + money);
                System.out.print("배팅 금액 : ");
                batting = scn.nextInt();
            } while (batting > money);

            System.out.print("가위(1), 바위(2), 보자기(3) 입력 :");
            int user = scn.nextInt();
            System.out.print("결과를 보려면 Enter를 치세요");
            System.in.read();

            System.out.println();

            // 가위바위보 시행
            if (user == rand) {
                System.out.println("비겼다!");
                System.out.println("현재 금액은 " + money + "원");
            } else if (user == 1 && rand == 3) {
                System.out.println("컴퓨터 보자기, 나는 가위");
                System.out.println("야~호 이겼다.");
                money += batting;
                System.out.println("현재 금액은 " + money + "원");
            } else if (user == 1 && rand == 2) {
                System.out.println("컴퓨터 바위, 나는 가위");
                System.out.println("ㅠㅠ..졌다");
                money -= batting;
                System.out.println("현재 금액은 " + money + "원");
            } else if (user == 2 && rand == 3) {
                System.out.println("컴퓨터 보자기, 나는 바위");
                System.out.println("ㅠㅠ..졌다");
                money -= batting;
                System.out.println("현재 금액은 " + money + "원");
            } else if (user == 2 && rand == 1) {
                System.out.println("컴퓨터 가위, 나는 바위");
                System.out.println("야~호 이겼다.");
                money += batting;
                System.out.println("현재 금액은 " + money + "원");
            } else if (user == 3 && rand == 2) {
                System.out.println("컴퓨터 바위, 나는 보자기");
                System.out.println("야~호 이겼다.");
                money += batting;
                System.out.println("현재 금액은 " + money + "원");
            } else if (user == 3 && rand == 1) {
                System.out.println("컴퓨터 가위, 나는 보자기");
                System.out.println("ㅠㅠ..졌다");
                money -= batting;
                System.out.println("현재 금액은 " + money + "원");
            }

            while (!yn.equals("n") && !yn.equals("N") && !yn.equals("y") && !yn.equals("Y")) {
                System.out.print("또 할래 (y/n) : ");
                yn = scn.next();
            }
            if (yn.equals("n") || yn.equals("N")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 돈 없을때
            if (money <= 0) {
                int insertCoin = 0;

                while (insertCoin <= 0) {
                    System.out.print("insert coin : ");
                    insertCoin = scn.nextInt();
                    if (insertCoin < 0) {
                        System.out.println("음수를 넣을수는 없음!!");
                        continue;
                    }
                    money += insertCoin;
                }
            }

        }
    }
}

/**
 * [문제] 가위 바위 보 게임
 * - 가위(1), 바위(2), 보자기(3)으로 설정한다.
 * - 컴퓨터는 난수 1 ~ 3 사이의 숫자를 발생한다.
 * - 기본 금액은 1000원을 기본으로 설정한다.
 * - 돈이 떨어지면(0 이하이면) 게임을 계속할지 물어보고 계속하려면 현금 입력을 받고 다시 게임을 한다.
 *
 * [실행결과]
 * 가위(1), 바위(2), 보자기(3) 입력 : 1
 * 배팅 금액 : 100
 * 결과를 보시려면 Enter를 치세요
 *
 * 컴퓨터 바위, 나는 가위
 * ㅠㅠ..졌다
 * 현재 금액은 900윈
 * ---------------------
 *
 * 가위(1), 바위(2), 보자기(3) 입력 : 1
 * 배팅 금액 : 100
 * 결과를 보시려면 Enter를 치세요
 *
 * 컴퓨터 보자기, 나는 가위
 * 야~호 이겼다.
 * 현재 금액은 -100윈
 *
 * 또 할래 (y/n) : n
 * 프로그램을 종료합니다.
 *
 * 또는
 * 또 할래 (y/n) : y
 * insert coin :
 */