package homework;

import java.text.DecimalFormat;

public class ReviewCompute {

    public static void main(String[] args) {

        short a = 320;
        short b = 258;

        short sum = (short) (a+b);
        int sub = a-b;
        int mul = a*b;
        double div = (double) a / b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " * " + b + " = " + new DecimalFormat("#,###").format(mul));
        System.out.println(a + " / " + b + " = " + div);
        System.out.printf("%d / %d = %.2f\n", a, b, div);
        System.out.println(a + " / " + b + " = " + String.format("%.2f\n", div));
    }

    /**
     * [문제] 변수를 이용하여 320, 258의 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오
     * short형 변수 활용.
     *
     * [실행결과]
     * 320 + 258 = 578
     * 320 - 258 = 62
     * 320 * 258 = 82560
     * 320 * 258 = 82,560 (DecimalFormat)
     * 320 / 258 = 1.2403100775193798
     * 320 / 258 = 1.24 (%d, %f 활용)
     * 320 / 258 = 1.24 (String.Format())
     *
     */
}
