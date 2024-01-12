package operator;

/**
 * 2023-12-21
 */
public class Operator04 {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        boolean result;

        result = ((num1 += 10) < 0 && (num2 += 10) > 0); // &&는 앞조건에서 판별이 나면 뒷조건은 수행 X.

        System.out.println("result = " + result);
        System.out.println("num1 = " + num1 + "  num2 = " + num2);
        System.out.println();

        result = ((num1 += 10) > 0 || (num2 += 10) > 0); // ||는 앞조건에서 판별이 나면 뒷조건은 수행 X.

        System.out.println("result = " + result);
        System.out.println("num1 = " + num1 + "  num2 = " + num2);
        System.out.println();

        /**
         * & , | : 모든 두 조건을 무조건 참 거짓을 비교해봄.
         */

    }
}
