package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 2024-01-04
 */
public class SungJukService {

    private SungJuk sungJuk;
    private ArrayList<SungJukDTO> list = new ArrayList<>();

    public void menu() {


        while (true) {
            Scanner scn = new Scanner(System.in);

            System.out.println();
            System.out.println("    1. 입력");
            System.out.println("    2. 출력");
            System.out.println("    3. 수정");
            System.out.println("    4. 삭제");
            System.out.println("    5. 정렬");
            System.out.println("    6. 끝");
            int select;

            try {
                select = scn.nextInt();
            } catch (Exception e) {
                System.out.println("1~6중에 선택하세요");
                continue;
            }

            if (select == 1) {
                sungJuk = new SungJukInsert();
            } else if (select == 2) {
                sungJuk = new SungJukPrint();
            } else if (select == 3) {
                sungJuk = new SungJukUpdate();
            } else if (select == 4) {
                sungJuk = new SungJukDelete();
            } else if (select == 5) {
                sungJuk = new SungJukSort();
            } else if (select == 6) {
                break;
            } else {
                System.out.println("1~6중에 선택하세요");
                continue;
            }

            sungJuk.execute(list);

        }

    }
}

/**
 * 6. menu() 작성한다.
 *  *    만약에 1 ~ 6번 외의 숫자가 들어오면 "1~6중에 선택하세요" 메세지를 출력 후 다시 입력받는다.
 *  *    1. 입력
 *  *    2. 출력
 *  *    3. 수정
 *  *    4. 삭제
 *  *    5. 정렬
 *  *    6. 끝
 */