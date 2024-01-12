package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 2024-01-04
 */
public class SungJukDelete implements SungJuk {
    @Override
    public void execute(ArrayList<SungJukDTO> list) {

        Scanner scn = new Scanner(System.in);

        System.out.print(" 삭제할 이름 입력 :");
        String findName = scn.next();

        int cnt = 0;

        Iterator<SungJukDTO> iter = list.iterator();
        while (iter.hasNext()) {
            // iter.next() : 현재 위치의 항목을 임시저장소에 저장 한 후, 다음 항목으로 커서를 이동.
            if (iter.next().getName().equals(findName)) {
                iter.remove();
                cnt++;
            }
        }

//        int size = list.size();
//        for (int i = 0; i < size; i++) {
//            if (list.get(i).getName().equals(findName)) {
//                list.remove(i);
//                i--;
//                size--;
//                cnt++;
//            }
//        }


        if (cnt == 0) {
            System.out.println(" 회원의 정보가 없습니다.");
        } else {
            System.out.println(" " + cnt + "건의 항목을 삭제하였습니다.");
        }
    }
}

/**
 * * 10. SungJukDelete.java
 *  * - 이름을 입력하여 없는 이름이면 "회원의 정보가 없습니다" 출력하시오
 *  * - 똑같은 이름이 있으면 모두 삭제한다.
 *  *
 *  * 삭제할 이름 입력 : 천사
 *  * 회원의 정보가 없습니다
 *  *
 *  * 또는
 *  *
 *  * x건의 항목을 삭제하였습니다.
 */