package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2024-01-05
 */
public class EmployeeSearch implements Employee {

    @Override
    public void execute(ArrayList<EmployeeDTO> list) {

        Scanner scn = new Scanner(System.in);
        System.out.print("검색할 사원의 이름 입력 : ");
        String findEmployee = scn.next();

        boolean isPresent = false;

        for (EmployeeDTO dto : list) {
            if (dto.getName().equals(findEmployee)) {
                System.out.println("사원번호\t이름\t직급\t기본급\t\t\t수당\t\t\t합계\t\t\t세율\t세금\t\t월급");
                System.out.printf("%d\t%s\t%s\t%d\t\t\t%d\t\t\t%d\t\t\t%.2f\t%.2f\t\t%f\n",
                        dto.getId(), dto.getName(), dto.getJob(), dto.getBase(), dto.getExtra(),
                        dto.getTot(), dto.getTaxRate(), dto.getTax(), dto.getSalary());

                isPresent = true;
            }
        }
        System.out.println();

        if (!isPresent) {
            System.out.println("해당 사원이름은 존재하지 않습니다!!");
        }


    }
}

/**
 * 검색 : 이름을 입력하면, 그 직원의 이름, 직급, 기본급, 수당, 합계, 세율, 세금, 월급을 보여준다.
 */