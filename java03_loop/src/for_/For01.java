package for_;

/**
 * 2023-12-22
 */
public class For01 {

    public static void main(String[] args) {

        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
        }
        System.out.println("for문을 탈출합니다 : " + i);
        System.out.println();

        // 10 9 8 7 ~ 2 1
        for (int j = 10; j >= 1; --j) {
            System.out.print(j + "\t");
        }
        System.out.println();

        // A B C D E F G ~ X Y Z
        for (int j = 'A'; j <= 'Z'; ++j) {
            System.out.print((char) j + "\t");
        }
        System.out.println();

    }
}
