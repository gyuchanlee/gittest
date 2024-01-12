package variable;

import java.text.DecimalFormat;

public class Compute {

    short field; // 필드

    public static void main(String[] args) {
        short a = 320; // local variable
        short b = 258;
        long c = 121;

//        short wrongSum = a + b; // short형 + short형 = 결과는 반드시 int형.
        long shortLong = a + c; // short + long은 더 큰 자료형인 long으로 자동형변환.
        short sum = (short) (a + b); // 결과값 강제형변환.
        int sub = (a - b);
        int mul = a * b;
        double div = (double) a / b; // 한쪽을 강제형변환함으로써 다른 쪽도 double형으로 자동형변환.

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + mul);
        // DecimalFormat : 십진수 형식화를 해주는 클래스 > 생성자를 통해 포맷 설정.
        System.out.println(a + " * " + b + " = " + new DecimalFormat("###,###").format(mul));
        System.out.println(a + " / " + b + " = " + div);
        System.out.printf("%d / %d = %.2f\n", a, b, div);
        System.out.printf(String.format("%d", a) + " / " + String.format("%d", b) + " = " + String.format("%.2f\n", div));

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
