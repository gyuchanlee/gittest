package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 2023-12-21
 */
public class Salary {

    public static void main(String[] args) {

        // 이름, 직급. 급여 입력
        Scanner scn = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = scn.nextLine();
        System.out.print("직급 입력 : ");
        String rank = scn.nextLine();
        System.out.print("기본급 입력 : ");
        int basePay = scn.nextInt();
        System.out.print("수당 입력 : ");
        int allowance = scn.nextInt();

        // 월급 계산 (변수 저장 및 처리)
        int total = basePay + allowance;

//        double scale = 0.0;
//        if (total >= 5000000) {
//            scale = 0.03;
//        } else if (total >= 3000000) {
//            scale = 0.02;
//        } else {
//            scale = 0.01;
//        }

        double scale = total >= 5000000 ? 0.03 : total >= 3000000 ? 0.02 : 0.01;
        double tax = total * scale;
        double netSalary = total - tax;
        DecimalFormat df = new DecimalFormat("#,###"); // df를 객체 하나만 만들어서 여러번 사용.

        // 출력
        System.out.println();
        System.out.println(" *** " + name + " " + rank + " 월급 *** ");
        System.out.println("기본급 : " + df.format(basePay) + "원");
        System.out.println("수당 : " + df.format(allowance) + "원");
        System.out.println("합계 : " + df.format(total) + "원");
        System.out.println("세금 : " + df.format(tax) + "원");
        System.out.println("월급 : " + df.format(netSalary) + "원");


    }
}

/**
 * [문제] 월급 계산 프로그램 - 조건 연산자
 *
 * 1.이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
 * 단 합계가 5,000,000원 이상이면 3%
 *        3,000,000원 이상이면 2%
 *        아니면 1%
 *
 * 2. 숫자는 세자리마다 쉼표 찍어준다
 *
 * 3. 정수형으로 표현, 소수점 이하 수는 표시 X.
 *
 * 합계 = 기본급 + 수당
 * 세금 = 합계 * 세율
 * 월급 = 합계 - 세금
 *
 * [실행결과]
 * 이름 입력 : 홍길동
 * 직급 입력 : 부장
 * 기본급 입력 : 4900000
 * 수당 입력 : 200000
 *
 * *** 홍길동 부장 월급 ***
 * 기본급 : 4,900,000원
 * 수당 : 200,000원
 * 합계 : 5,100,000원
 * 세금 : 153,000원
 * 월급 : 4,947,000원
 */
