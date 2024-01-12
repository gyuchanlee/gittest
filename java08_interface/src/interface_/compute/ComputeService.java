package interface_.compute;

import java.util.Scanner;

/**
 * 2024-01-04
 */
public class ComputeService {

    private Compute compute;

    public void menu() {

        while (true) {
            System.out.println("===== 계산기 =====");
            System.out.println("1. 덧셈");
            System.out.println("2. 뺄셈");
            System.out.println("3. 곱셈");
            System.out.println("4. 나눗셈");
            System.out.println("5. 종료");
            System.out.println("=================");
            System.out.println();

            Scanner scn = new Scanner(System.in);
            int choose = 0;
            try {
                choose = scn.nextInt();
            } catch (Exception e) {
                System.out.println("1-5번까지 선택하시오");
                continue;
            }

            if (choose == 1) {
                compute = new Sum();
            } else if (choose == 2) {
                compute = new Sub();
            } else if (choose == 3) {
                compute = new Mul();
            } else if (choose == 4) {
                compute = new Div();
            } else if (choose == 5) {
                break;
            } else {
                System.out.println("1-5번까지 선택하시오");
                continue;
            }

            double result = compute.compute(scn);

            compute.display(result);

        }

    }

}
