package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2024-01-05
 */
public class EmployeeService {

    private ArrayList<EmployeeDTO> list = new ArrayList<>();
    private Employee employee;

    public void menu() {

        while (true) {

            Scanner scn = new Scanner(System.in);
            System.out.println("============ 월 급 계 산 ==============");
            System.out.println("1. 등록");
            System.out.println("2. 출력");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 검색");
            System.out.println("6. 정렬");
            System.out.println("7. 종료");
            System.out.println("===================================");

            int select = 0;
            try {
                select = scn.nextInt();
            } catch (Exception e) {
                System.out.println("1-7번 중에 고르세요");
                continue;
            }

            if (select == 1) {
                // 등록
                employee = new EmployeeInsert();
            } else if (select == 2) {
                // 출력
                employee = new EmployeePrint();
            } else if (select == 3) {
                // 수정
                employee = new EmployeeUpdate();
            } else if (select == 4) {
                // 삭제
                employee = new EmployeeDelete();
            } else if (select == 5) {
                // 검색
                employee = new EmployeeSearch();
            } else if (select == 6) {
                // 정렬
                employee = new EmployeeSort();
            } else if (select == 7) {
                System.out.println("프로그램을 종료한다.");
                break;
            } else {
                System.out.println("1-7번 중에 고르세요");
                continue;
            }

            employee.execute(list);

        }
    }
}
/**
 * 3. 시작화면으로 메뉴를 보여준다.
 *    각 메뉴의 기능은 다음과 같다.
 *      등록 : 사원번호, 이름, 직급, 기본급, 수당을 입력받아서 합계, 세율, 세금, 월급을 계산한다.
 *              단, 사원번호는 중복되게 입력해서는 안된다.
 *      출력 : 모든 직원의 사원번호, 이름, 직급, 기본급, 수당, 합계, 세율, 세금, 월급을 보여준다.
 *      수정 : 특정 직원의 사원번호,직급, 기본급, 수당을 입력받아서 수정한다.
 *      삭제 : 특정 직원의 사원번호를 입력받아서 삭제한다.
 *      검색 : 이름을 입력하면, 그 직원의 이름, 직급, 기본급, 수당, 합계, 세율, 세금, 월급을 보여준다.
 *      정렬 : 월급을 기준으로 내림차순한다.
 *      종료 : 프로그램을 종료한다.
 */