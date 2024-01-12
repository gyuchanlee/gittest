package test;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort implements Employee {

    @Override
    public void execute(ArrayList<EmployeeDTO> list) {

        if (!list.isEmpty()) {
            list.sort(Collections.reverseOrder());
            System.out.println("월급을 기준으로 내림차순 정렬을 실시합니다...");
            System.out.println();
        } else {
            System.out.println("정보가 없으므로 정렬을 할 수 없습니다...");
            System.out.println();
        }
    }
}

/**
 * 정렬 : 월급을 기준으로 내림차순한다.
 */