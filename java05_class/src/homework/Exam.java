package homework;

import java.util.Scanner;

/**
 * 2023-12-29
 *
 *
 * * * 필드
 *  * private String name = null;
 *  * private String dap = null;
 *  * private char[] ox = null;
 *  * private int score = 0;
 *  * private final String JUNG="11111"; //상수화
 *  *
 *  * * 메소드
 *  * 생성자 - Scanner 쓰기
 *  * compare() - 비교
 *  * getName()
 *  * getOx()
 *  * getScore()
 */
public class Exam {

    private final String JUNG = "11111"; // 상수

    private String name = null;
    private String dap = null;
    private char[] ox = null;
    private int score = 0;

    Exam(Scanner scn) {
        scn = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        name = scn.nextLine();
        System.out.print("답 입력 : ");
        dap = scn.nextLine();
    }

    // 정답 비교, OX여부, 점수계산
    public void compare() {
        char[] charArray = dap.toCharArray();
        ox = new char[JUNG.length()];
        for (int i = 0; i < 5; i++) {
            if (JUNG.charAt(i) == charArray[i]) {
                ox[i] = 'O';
                score += 20;
            } else {
                ox[i] = 'X';
            }
        }
    }

    public String getName() {
        return name;
    }

    public char[] getOx() {
        return ox;
    }

    public int getScore() {
        return score;
    }
}
