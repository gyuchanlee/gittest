package sungJuk;

import java.util.ArrayList;

/**
 * 2024-01-04
 */
public class SungJukPrint implements SungJuk {

    @Override
    public void execute(ArrayList<SungJukDTO> list) {

        System.out.println(" 번호\t이름\t국어\t영어\t수학 \t총점\t평균");
        if (list.isEmpty()) {
            System.out.println("        ==== 정보 없음 ====");
        } else {
            for (SungJukDTO dto : list) {
                System.out.printf(" %3d\t%s\t%3d\t%3d\t%3d \t%3d\t%3.2f\n",
                        dto.getNo(), dto.getName(), dto.getKor(), dto.getEng(),
                        dto.getMath(), dto.getTot(), dto.getAvg());
            }
        }
    }
}

/**
 *  8. SungJukPrint.java
 *  * - ArrayList에 저장된 모든 데이터를 출력한다.
 *  *
 *  * 번호	이름	국어	영어	수학 	총점	평균
 *  *
 */