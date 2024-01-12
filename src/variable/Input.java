package variable;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 2023-12-21
 */
public class Input {

    public static void main(String[] args) throws IOException {
        /**
         * 입력 : System.in.read()
         */

        System.out.print("정수 입력 : ");
        int a = System.in.read();
        System.in.read(); // \r \n 플러시.

        System.out.print("정수 입력 : ");
        int b = System.in.read();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println("a = " + (char) a + " b = " + (char) b);

//        System.out.print("데이터 입력 : ");
//        int data = System.in.read(); // 1개의 문자만 받음.
//        System.out.println("data = " + data);
//        System.out.println("(char)data = " + (char) data);

//        Scanner scanner = new Scanner(System.in); // 입력받기
//        String str = scanner.nextLine();
//        System.out.println("str = " + str);

    }
}
