package homework;

import java.util.Scanner;

/**
 * 2024-01-02
 */
public class StringMain {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = scn.nextLine().toLowerCase();
        System.out.print("현재 문자열 입력 : ");
        String target = scn.nextLine();
        System.out.print("바꿀 문자열 입력 : ");
        String replacement = scn.nextLine();

        if (str.length() < target.length() || str.length() < replacement.length()) {
            System.out.println("입력한 문자열의 크기가 작습니다");
            System.out.println("치환할 수 없습니다.");
            return;
        }

        String replaced = str.replace(target, replacement);
        System.out.println(replaced);
        int count = (str.length() - str.replace(target, "").length()) / (target.length());
        System.out.println(count + "개 치환");
    }
}

/**
 * 치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
 * String 클래스의 메소드를 이용하시오
 * 대소문자 상관없이 개수를 계산하시오 (대소문자 통일 필요)
 *
 * [실행결과]
 * 문자열 입력 : aabba
 * 현재 문자열 입력 : aa
 * 바꿀 문자열 입력 : dd
 * ddbba
 * 1번 치환
 *
 * 문자열 입력 : aAbbA
 * 현재 문자열 입력 : aa
 * 바꿀 문자열 입력 : dd
 * ddbba
 * 1번 치환
 *
 * 문자열 입력 : aabbaa
 * 현재 문자열 입력 : aa
 * 바꿀 문자열 입력 : dd
 * ddbbdd
 * 2번 치환
 *
 * 문자열 입력 : AAccaabbaaaaatt
 * 현재 문자열 입력 : aa
 * 바꿀 문자열 입력 : dd
 * ddccddbbddddatt
 * 4개 치환
 *
 * 문자열 입력 : aabb
 * 현재 문자열 입력 : aaaaa
 * 바꿀 문자열 입력 : ddddd
 * 입력한 문자열의 크기가 작습니다
 * 치환 할 수 없습니다
 */