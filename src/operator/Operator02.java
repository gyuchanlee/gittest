package operator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2023-12-21
 */
public class Operator02 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("시험 점수를 입력 : ");
        int score = scn.nextInt();
        String result = score >= 80 && score <= 100 ? "합격" : "불합격";
        System.out.println(result);

//        Scanner scn = new Scanner(System.in);
//        int score = 0;
//        System.out.print("점수 입력 : ");
//        try {
//            score = scn.nextInt();
//        } catch (InputMismatchException e) {
//            System.out.println("정수 점수만 입력하세요");
//        }
//
//        String result = score >= 80 && score <= 100 ? "합격" : "불합격";
//
//        System.out.println("시험 결과 : " + result);

    }
}

/**
 * [문제] 점수를 입력하여 합격인지 불합격인지 판별하는 프로그램
 * 점수가 80 - 100 사이면 합격으로 간주함.
 * - 삼항연산자를 활용하여 판별하라.
 */
