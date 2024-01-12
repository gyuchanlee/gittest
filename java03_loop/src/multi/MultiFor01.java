package multi;

/**
 * 2023-12-22
 */
public class MultiFor01 {

    public static void main(String[] args) {
        /**
         * 다중 for문
         */

        for (int i = 2; i <= 4; i += 2) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + "\tj = " + j);
            } // for j
            System.out.println();
        } // for i
    }
}
