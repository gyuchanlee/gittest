package test;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeInsert implements Employee {
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {

        Scanner scn = new Scanner(System.in);
        System.out.print("사원 번호 등록 : ");
        Long id = scn.nextLong();
        System.out.print("이름 등록 : ");
        String name = scn.next();
        System.out.print("직급 등록 : ");
        String job = scn.next();
        System.out.print("기본급 등록 : ");
        int base = scn.nextInt();
        System.out.print("수당 등록 : ");
        int extra = scn.nextInt();

        EmployeeDTO employee = new EmployeeDTO(id, name, job, base, extra);
        employee.calc();
        list.add(employee);

        System.out.println(employee.getName() + " " + employee.getJob() + " 등록 완료되었습니다.");
    }
}

/**
 * 등록 : 사원번호, 이름, 직급, 기본급, 수당을 입력받아서 합계, 세율, 세금, 월급을 계산한다.
 *              단, 사원번호는 중복되게 입력해서는 안된다.
 */