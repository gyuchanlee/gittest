package if_;

import java.util.Scanner;

/**
 * 2023-12-21
 */
public class If01 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("데이터 입력 : ");
        int a = scn.nextInt();

        if (a >= 50) {
            System.out.println(a + "는 50보다 크거나 같다.");
            System.out.println();
        } else {
            System.out.println(a + "는 50보다 작다.");
            System.out.println();
        }

        if (true) System.out.println("A");
            if (true) System.out.println("B");
            else System.out.println("C");
        System.out.println();

        if (true) System.out.println("A");
            if (false) System.out.println("B");
            else System.out.println("C");
        System.out.println();

        if (false)
            if (false) System.out.println("A");
            else System.out.println("B");
        System.out.println("C");
        System.out.println();

    }
}
