package for_;

import java.io.IOException;

/**
 * 2023-12-22
 */
public class For02 {

    public static void main(String[] args) throws IOException {
        System.out.print("원하는 단을 입력 : ");
        int dan = System.in.read() - '0';

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + "*" + i + "=" + (dan * i));
        }

        System.out.println();
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

/**
 * 원하는 단을 입력 : 2
 * 2*1=2
 * 2*2=4
 * 2*3=6
 * 2*4=8
 * 2*5=10
 * 2*6=12
 * 2*7=14
 * 2*8=16
 * 2*9=18
 */
