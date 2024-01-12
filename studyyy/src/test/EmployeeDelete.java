package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 2024-01-05
 */
public class EmployeeDelete implements Employee {

    @Override
    public void execute(ArrayList<EmployeeDTO> list) {

        Scanner scn = new Scanner(System.in);
        System.out.print("삭제할 사원의 사원번호를 입력 : ");
        long findEmployee = scn.nextLong();

        int cnt = 0;
        Iterator<EmployeeDTO> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == findEmployee) {
                iterator.remove();
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("해당하는 사원번호가 존재하지 않습니다!!");
            System.out.println();
        } else {
            System.out.println(cnt + "건 삭제 완료!!");
            System.out.println();
        }

    }
}

/**
 * 삭제 : 특정 직원의 사원번호를 입력받아서 삭제한다.
 */