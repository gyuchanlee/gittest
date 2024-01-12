package interface_.compute;

import java.util.Scanner;

/**
 * 2024-01-04
 */
public class Sum implements Compute {

    @Override
    public double compute(Scanner scn) {
        System.out.print("숫자입력 1 :");
        int a = scn.nextInt();
        System.out.print("숫자입력 2 :");
        int b = scn.nextInt();

        return a + b;
    }

    @Override
    public void display(double result) {
        System.out.println();
        System.out.println("결과물 : " + (int) result);
        System.out.println();
        System.out.println();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
