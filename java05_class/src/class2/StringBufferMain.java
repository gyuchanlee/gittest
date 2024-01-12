package class2;

import java.util.Scanner;

/**
 * 2023-12-29
 */
public class StringBufferMain {
    private int dan;

    StringBufferMain(Scanner scn) {
        // 입력받기
        System.out.print("원하는 단을 입력 : ");
        dan = scn.nextInt();
    }

    private void display() {
        // 구구단 출력
        System.out.println("========");

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
//            System.out.println(dan + "*" + i + "=" + (dan * i));
            sb.append(dan);
            sb.append("*");
            sb.append(i);
            sb.append("=");
            sb.append(dan*i);
            System.out.println(sb);
            System.out.println(sb.reverse());
            // StringBuffer에 값을 계속해서 누적에서 더함.
            sb.delete(0, sb.length());
            // for 돌때마다 출력한 단어는 안쓰이므로 삭제.
            System.out.println();
        }

        System.out.println("========");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        StringBufferMain stringBufferMain = new StringBufferMain(scn);
        stringBufferMain.display();

    }

}

/**
 * - StringBuffer
 *  메서드에 synchronized 붙음 > 멀티 스레드환경에서 동기화 지원, thread-safe함
 *  대신 동기화 처리로 인해 빌더보다 성능이 낮음.
 *
 *
 * - StringBuilder
 * 단일 스레드 환경에서 문자열을 계속 더할때 가장 나은 성능을 보임.
 *
 * * 모두 가변 클래스이며, 편집 가능.
 */