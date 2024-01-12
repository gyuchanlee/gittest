package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2024-01-04
 */
public class SungJukInsert implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        Scanner scn = new Scanner(System.in);
        System.out.print(" 번호 입력 :");
        int no = scn.nextInt();
        System.out.print(" 이름 입력 :");
        String name = scn.next();
        System.out.print(" 국어 입력 :");
        int kor = scn.nextInt();
        System.out.print(" 영어 입력 :");
        int eng = scn.nextInt();
        System.out.print(" 수학 입력 :");
        int math = scn.nextInt();
        System.out.println();

        SungJukDTO dto = new SungJukDTO(no, name, kor, eng, math);
        dto.calc();
        list.add(dto);

        System.out.println("입력되었습니다");
        System.out.println();
    }
}

/**
 *  * 7. SungJukInsert.java
 *  * - 번호, 이름, 국어, 영어, 수학를 입력하여 총점과 평균을 계산한다.
 *  *
 *  * 번호 입력 :
 *  * 이름 입력 :
 *  * 국어 입력 :
 *  * 영어 입력 :
 *  * 수학 입력 :
 *  *
 *  * 입력되었습니다
 *  *
 */