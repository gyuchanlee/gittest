package switch_;

import java.io.IOException;
import java.util.Scanner;

/**
 * 2023-12-21
 */
public class Switch02 {

    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);
        System.out.print("a의 값 : ");
        int a = scn.nextInt();
        System.out.print("b의 값 : ");
        int b = scn.nextInt();
        System.out.print("연산자(+,-,*,/)를 입력 : ");
        int op = System.in.read();

        switch (op) {
            case '+':
                System.out.printf("%d %c %d = %d\n", a, (char) op, b, (a + b));
                break;
            case '-':
                System.out.printf("%d %c %d = %d\n", a, (char) op, b, (a - b));
                break;
            case '*':
                System.out.printf("%d %c %d = %d\n", a, (char) op, b, (a * b));
                break;
            case '/':
                System.out.printf("%d %c %d = %.12f\n", a, (char) op, b, (a / (double) b));
                break;
            default:
                System.out.println("연산자 error");
        }

//        Scanner scn = new Scanner(System.in);
//        System.out.print("a의 값 : ");
//        int a = scn.nextInt();
//        System.out.print("b의 값 : ");
//        int b = scn.nextInt();
//        System.out.print("연산자 (+, -, *, /) 를 입력 : ");
//        int op = System.in.read();
//
//        switch (op) {
//            case '+' :
//                System.out.println(a + " " + (char) op + " " + b + " = " + (a + b));
//                break;
//            case '-' :
//                System.out.println(a + " " + (char) op + " " + b + " = " + (a - b));
//                break;
//            case '*' :
//                System.out.println(a + " " + (char) op + " " + b + " = " + (a * b));
//                break;
//            case '/' :
//                System.out.println(a + " " + (char) op + " " + b + " = " + (a / (double) b));
//                break;
//            default:
//                System.out.println("연산자 error");
//        }

    }
}

/**
 * 2개의 정수형 숫자와 연산자(+,-,*,/)를 입력하여 계산하시오
 * 연산자는 System.in.read()로 받기.
 *
 * [실행결과]
 * a의 값 : 25
 * b의 값 : 36
 * 연산자(+,-,*,/)를 입력 : +
 *
 * 25 + 36 = xx
 *
 * a의 값 : 25
 * b의 값 : 36
 * 연산자(+,-,*,/)를 입력 : /
 *
 * 25 / 36 = 0.6944444444444444
 *
 * a의 값 : 25
 * b의 값 : 36
 * 연산자(+,-,*,/)를 입력 : #
 *
 * 연산자 error
 */
