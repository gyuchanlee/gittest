package test;

import java.util.ArrayList;

/**
 * 2024-01-05
 */
public class EmployeePrint implements Employee {

    @Override
    public void execute(ArrayList<EmployeeDTO> list) {

        System.out.println("사원번호\t이름\t\t직급\t\t기본급\t\t\t수당\t\t\t합계\t\t\t세율\t\t세금\t\t\t월급");

        if (list.isEmpty()) {
            System.out.println("========================== 정보없음 ==========================");
        }

        for (EmployeeDTO dto : list) {
            System.out.printf("%d\t\t%s\t%s\t\t%d\t\t%d\t\t%d\t\t%.2f\t\t%.2f\t\t%.0f\n",
                    dto.getId(), dto.getName(), dto.getJob(), dto.getBase(), dto.getExtra(),
                    dto.getTot(), dto.getTaxRate(), dto.getTax(), dto.getSalary());
        }

        System.out.println();
    }
}

/**
 *  출력 : 모든 직원의 사원번호, 이름, 직급, 기본급, 수당, 합계, 세율, 세금, 월급을 보여준다.
 */