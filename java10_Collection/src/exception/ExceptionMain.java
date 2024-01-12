package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2024-01-09
 */
public class ExceptionMain {

    public static void main(String[] args) {
        /**
         * 예외 처리
         * 1. 최상위 Throwable 클래스에서 Exception (예외) 와 Error(에러) 로 나뉨. > Error는 개발자가 수습 못할 치명적인 시스템 에러.
         * 2. Exception은 개발자가 처리가능하고 개발자 로직 혹은 사용자의 영향으로 발생하기 때문에 처리 가능.
         * 3.  자바가 제공하는 Override한 메소드에는 throws 사용해서는 안된다.
         *
         * 체크 예외와 언체크 예외
         * - 체크 예외 : 컴파일 과정에서 검사 가능한 예외. Exception을 상속받아 구현 (런타임 예외 이외의 예외 클래스들)
         * - 언체크 예외 : 런타임 예외, 런타임 과정에서 발생하는 예외. RuntimeException을 상속받아 구현. 컴파일 과정에서 체크 안됨.
         * >> 스프링 트랜잭션에서 체크 예외는 롤백이 안됨
         * >> 스프링에서 예외는 런타임 예외로 통일해서 처리하는 것이 좋음 >> 계층마다 예외에 종속되지 않게 하기 위함. 각 계층에서 복구 불가능한 예외는 처리불가.
         */

//        try {
//            System.out.println("args[0] = " + args[0]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // 비즈니스 로직으로 잘못됨을 알리거나, 꼭 필요한 경우 예외를 공통으로 처리해서 고객에게 보여줄 부분만 보냄.
//            System.out.println("배열의 범위를 벗어남");
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("에러가 나든 안나든 실행되는 구간");
//        }

        try {
            Scanner scn = new Scanner(System.in);
            System.out.print("숫자 입력 : ");
            int num2 = scn.nextInt();

            System.out.println("num1 = " + num2);
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("숫자를 제대로 넣으세요!!");
        }

    }
}
