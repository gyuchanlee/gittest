package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2024-01-04
 */
public class SungJukUpdate implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> list) {
        Scanner scn = new Scanner(System.in);

        System.out.print(" 번호 입력 : ");
        int find = scn.nextInt();

        boolean isPresent = false;

        for (SungJukDTO dto : list) {
            if (dto.getNo() == find) {
                isPresent = true;

                System.out.println(" 번호\t이름\t국어\t영어\t수학 \t총점\t평균");
                System.out.printf(" %3d\t%s\t%3d\t%3d\t%3d \t%3d\t%3.2f",
                        dto.getNo(), dto.getName(), dto.getKor(), dto.getEng(),
                        dto.getMath(), dto.getTot(), dto.getAvg());
                System.out.println();

                System.out.print(" 수정 할 이름 입력 : ");
                String reName = scn.next();
                System.out.print(" 수정 할 국어 입력 : ");
                int reKor = scn.nextInt();
                System.out.print(" 수정 할 영어 입력 : ");
                int reEng = scn.nextInt();
                System.out.print(" 수정 할 수학 입력 : ");
                int reMath = scn.nextInt();

                dto.setName(reName);
                dto.setKor(reKor);
                dto.setEng(reEng);
                dto.setMath(reMath);
                dto.calc();

                System.out.println();
                System.out.println("수정하였습니다.");
                System.out.println();

            }
        }
        if (!isPresent) {
            System.out.println("잘못된 번호 입니다.");
        }
    }
}

/**
 * * 9. SungJukUpdate.java
 *  * - 없는 번호가 입력되면 "잘못된 번호 입니다." 라고 출력한다.
 *  * - 있는 번호가 입력되면 번호에 해당하는 데이틀 출력 후 수정한다.
 *  *   수정한 후에는 총점과 평균을 재계산해야 한다.
 *  * 번호 입력 :
 *  * 잘못된 번호 입니다.
 *  *
 *  * 또는
 *  *
 *  * 번호	이름	국어	영어	수학 	총점	평균
 *  *
 *  * 수정 할 이름 입력 :
 *  * 수정 할 국어 입력 :
 *  * 수정 할 영어 입력 :
 *  * 수정 할 수학 입력 :
 *  *
 *  * 수정하였습니다.
 *  *
 */
