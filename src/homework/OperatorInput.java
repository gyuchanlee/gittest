package homework;

import java.io.IOException;

/**
 * 2023-12-21
 */
public class OperatorInput {

    public static void main(String[] args) throws IOException {
        char ch;
        System.out.print("문자 입력 : ");
        ch = (char) System.in.read();
        char result = (char) (ch >= 'A' && ch <= 'Z' ? ch + 32 : ch - 32);
        System.out.println(ch + " -> " + result);
    }
}

/**
 * [문제] 문자를 입력하여 대문자이면 소문자로 변경 후, 출력하고
 * 만약에 대문자가 아니면 대문자로 변경 후, 출력하시오
 *
 * [조건]
 * 반드시 System.in.read() 사용하시오 > 영문자 한글자만 받음.
 * 조건연산자 활용 (삼항연산자)
 *
 *
 * [실행결과]
 * 문자 입력 : T
 * T -> t
 *
 * 문자 입력 : e
 *  * e -> E
 */
