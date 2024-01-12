package array;

import java.util.Scanner;

/**
 * 2023-12-26
 */
public class Array05 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        boolean[] parkPlace = new boolean[] {false, false, false, false, false};

        while (true) {
            System.out.println("주차장 관리 프로그램");
            System.out.println(" ************** ");
            System.out.println("\t1. 입차");
            System.out.println("\t2. 출차");
            System.out.println("\t3. 리스트");
            System.out.println("\t4. 종료");
            System.out.println(" ************** ");
            System.out.print("\t메뉴 : \t");

            int menu;
            try {
                menu = scn.nextInt();
            } catch (Exception e) {
                System.out.println("잘못된 입력!! 심각한 오류로 프로그램 종료");
                break;
            }
            System.out.println();

            if (menu == 1) { // 입차
                entrance(scn, parkPlace);
            } else if (menu == 2) { // 출차
                exit(scn, parkPlace);
            } else if (menu == 3) { // 리스트
                parkingList(parkPlace);
            } else if (menu == 4) { // 종료
                System.out.println("주차장 관리 프로그램을 종료합니다.");
                System.out.println();
                break;
            } else { // 입력 오류 대처
                System.out.println("1 ~ 4번 사이의 기능을 선택하시오!!!");
                System.out.println();
            }

        }

        scn.close(); // 자원 반납.
    }



    private static void entrance(Scanner scn, boolean[] parkPlace) {
        System.out.print("위치 입력 : " );
        int place = scn.nextInt();

        if (parkPlace[place - 1]) {
            System.out.println(place + "위치에 이미 주차되어 있습니다.");
        } else {
            System.out.println(place + "위치에 입차.");
            parkPlace[place - 1] = true;
        }
        threadSleep(1000);
        System.out.println();
    }

    private static void exit(Scanner scn, boolean[] parkPlace) {
        System.out.print("위치 입력 : " );
        int place = scn.nextInt();

        if (parkPlace[place - 1]) {
            System.out.println(place + "위치에 출차.");
            parkPlace[place - 1] = false;
        } else {
            System.out.println(place + "위치에 주차되어 있지 않습니다.");
        }
        threadSleep(1000);
        System.out.println();
    }

    private static void parkingList(boolean[] parkPlace) {
        for (int i = 0; i < parkPlace.length; i++) {
            System.out.println((i + 1) + "위치 : " + parkPlace[i]);
        }
        threadSleep(1500);
        System.out.println();
    }

    private static void threadSleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Thread 오류");
        }
    }
}

/**
 * 주차장 관리 프로그램
 * **************
 *    1. 입차
 *    2. 출차
 *    3. 리스트
 *    4. 종료
 * **************
 *   메뉴 :
 *
 * 1번인 경우
 * 위치 입력 : 3
 * 3위치에 입차 / 이미 주차되어있습니다
 *
 * 2번인 경우
 * 위치 입력 : 4
 * 4위치에 출차 / 주차되어 있지않습니다
 *
 * 3번인 경우
 * 1위치 : true
 * 2위치 : false
 * 3위치 : true
 * 4위치 : false
 * 5위치 : false
 *
 * 차가 주차 중 == true
 * 차가 없음 == false
 */