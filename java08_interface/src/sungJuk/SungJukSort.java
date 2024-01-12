package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        menu(list);
    }

    private void menu(ArrayList<SungJukDTO> list) {

        while (true) {

            System.out.println("=======================");
            System.out.println(" 1. 총점으로 내림차순");
            System.out.println(" 2. 이름으로 오름차순");
            System.out.println(" 3. 이전 메뉴");
            System.out.println("======================");

            Scanner scn = new Scanner(System.in);
            int select = 0;
            try {
                select = scn.nextInt();
            } catch (Exception e) {
                System.out.println("1-3번 중에 선택하세요");
                continue;
            }

            if (select == 1) {
                // 총점 내림차순 > Comparable tot 비교 기본 구현.
                list.sort(Collections.reverseOrder());
                break;
            } else if (select == 2) {
                // 이름 오름차순
                list.sort(Comparator.comparing(SungJukDTO::getName));
//                list.sort(((o1, o2) -> {
//                    return o1.getName().compareTo(o2.getName());
//                }));
                break;
            } else if (select == 3) {
                break;
            } else {
                System.out.println("1-3번 중에 선택하세요");
            }
        }
    }

}
