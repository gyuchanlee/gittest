package multi;

/**
 * 2023-12-22
 */
public class MultiFor02 {

    public static void main(String[] args) {

        for (int dan = 2; dan <= 9; dan++) {
            for (int i = 1; i <= 9 ; i++) {
                System.out.println(dan + "*" + i + "=" + (dan * i));
            }
            System.out.println();
        }
    }
}
/**
 * 2단 - 9단 구구단.
 *
 * 2*1=2
 * 2*2=4
 *
 * 2*9=18
 *
 * 3*1=3
 * 3*2=6
 *
 * 3*9=27
 */