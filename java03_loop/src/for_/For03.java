package for_;

/**
 * 2023-12-22
 */
public class For03 {

    public static void main(String[] args) {

        // 값 누적.
        int sum = 0;
        System.out.println("i\tsum");
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(i + "\t" + sum);
        }
        System.out.println();

        // 값 누적 곱.
        int mul = 1;
        System.out.println("i\tmul");
        for (int i = 1; i <= 10; i++) {
            mul *= i;
            System.out.println(i + "\t" + mul);
        }
        System.out.println();

    }
}