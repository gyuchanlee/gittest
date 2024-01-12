package operator;

import java.util.Scanner;

/**
 * 2023-12-21
 */
public class Operator01 {

    public static void main(String[] args) {
        int money = 0;

        // 돈 입력받기
        Scanner scn = new Scanner(System.in);
        System.out.print("현금 입력 : ");
        money = scn.nextInt();

        int chun = money / 1000;
        int baek = (money % 1000) / 100;
        int sip = (money % 100) / 10;
        int il = money % 10;

        System.out.println("천원 : " + chun + "장");
        System.out.println("백원 : " + baek + "개");
        System.out.println("십원 : " + sip + "개");
        System.out.println("일원 : " + il + "개");

//        System.out.print("현금 입력 : ");
//        Scanner scn = new Scanner(System.in);
//        money = scn.nextInt();
//
//        int chun = money / 1000; // 천의 자리 개수
//        int beak = (money % 1000) / 100; // 백의 자리 개수
//        int seap = (money % 100) / 10; // 십의 자리 개수
//        int ill = money % 10; // 나머지 일의 자리 개수
//
//        System.out.println("천원 : " + chun);
//        System.out.println("백원 : " + beak);
//        System.out.println("십원 : " + seap);
//        System.out.println("일원 : " + ill);

    }
}

/**
 * [문제] 동전 교환
 * 현금을 입력하여 천, 백, 십, 일의 개수를 구하시오
 *
 * [실행결과]
 * 현금 입력 : 5723
 * 천원 : 5장
 * 백원 : 7개
 * 십원 : 2개
 * 일원 : 3개
 */
