package while_;

/**
 * 2023-12-22
 */
public class While01 {

    public static void main(String[] args) {
        /**
         * 반복 횟수가 정해지지 않은 반복문 > while문이 더 편함
         * for문 -> 반복 횟수가 정해진 반복문일때 유리.
         */

        // 1 2 3 4 ... 9 10
        int i = 1; // 초기치
        while (i <= 10) {
            System.out.print(i + "\t");
            i++; // 증감치
        }
        System.out.println();

        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(j + "\t");
        }
        System.out.println();

        int k = 0;
        while (true) { // 무한루프 : for(;;)
            k++;
            System.out.print(k + "\t");

            if (k == 10) {
                break;
            }
        }
        System.out.println();

    }
}
