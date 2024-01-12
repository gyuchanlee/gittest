package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2024-01-05
 */
public class EmployeeUpdate implements Employee {

    @Override
    public void execute(ArrayList<EmployeeDTO> list) {

        Scanner scn = new Scanner(System.in);
        System.out.print("수정할 직원 사원번호 입력 : ");
        long findId = scn.nextLong();

        boolean isPresent = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == findId) {
                System.out.print("수정할 직급 입력 : ");
                String reJob = scn.next();
                System.out.print("수정할 기본급 입력 : ");
                int reBase = scn.nextInt();
                System.out.print("수정할 수당 입력 : ");
                int reExtra = scn.nextInt();

                EmployeeDTO rewriteEmployee = list.get(i);
                rewriteEmployee.setJob(reJob);
                rewriteEmployee.setBase(reBase);
                rewriteEmployee.setExtra(reExtra);
                rewriteEmployee.calc();

                isPresent = true;
                System.out.println("수정 완료!!");
                System.out.println();
            }
        }

        if (!isPresent) {
            System.out.println("찾은 사원 번호가 존재하지 않습니다!!");
        }
    }
}

/**
 * 수정 : 특정 직원의 사원번호,직급, 기본급, 수당을 입력받아서 수정한다.
 */