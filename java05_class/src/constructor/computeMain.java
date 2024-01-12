package constructor;

import java.util.Scanner;

/**
 * 2023-12-29
 */
public class computeMain {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Compute[] arr = new Compute[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("x 입력 : ");
            int x = scn.nextInt();
            System.out.print("x 입력 : ");
            int y = scn.nextInt();
            System.out.println();

            arr[i] = new Compute(x, y);
            arr[i].calc();
        }

        System.out.println(" X\t\tY\t\tSUM\t SUB\t MUL\t DIV");
        for (Compute compute : arr) {
            System.out.printf("%4d\t %d\t%d\t %4d\t%4d\t %.2f\n",
                    compute.getX(),
                    compute.getY(),
                    compute.getSum(),
                    compute.getSub(),
                    compute.getMul(),
                    compute.getDiv()
            );
        }
    }
}

/**
 * [문제] 합, 차, 곱, 몫을 구하시오
 * - main 함수에서 데이터를 입력 받는다.
 * - 몫은 소수이하 2째자리까지 처리
 * - 객체 배열
 *
 * 클래스명 : Compute
 * 필드   : x, y, sum, sub, mul, div
 * 메소드  : 생성자(x, y)
 *         calc() - 합, 차, 곱, 몫을 계산
 *         getX()
 * 		getY()
 * 		getSum()
 * 		getSub()
 * 		getMul()
 * 		getDiv()
 *
 * [실행결과]
 * x 입력 : 320
 * y 입력 : 258
 *
 * x 입력 : 256
 * y 입력 : 125
 *
 * x 입력 : 452
 * y 입력 : 365
 *
 *
 * X		Y		SUM		SUB		MUL		DIV
 * 320		258
 * 256		125
 * 452		365
 */