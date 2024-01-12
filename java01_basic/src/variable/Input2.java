package variable;

import java.util.Scanner;

/**
 * 2023-12-21
 */
public class Input2 {

    public static void main(String[] args) {
        /**
         * Scanner 클래스 : System.in을 이용해 입력을 받기 쉽게 해주는 클래스.
         */

        Scanner scn = new Scanner(System.in);
        System.out.print("데이터 입력 : ");
        String str = scn.nextLine();
        System.out.print("정수 입력 : ");
        int a = scn.nextInt();
        System.out.print("실수 입력 : ");
        double b = scn.nextDouble();

        System.out.println("str = " + str);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a+b));

    }
}
