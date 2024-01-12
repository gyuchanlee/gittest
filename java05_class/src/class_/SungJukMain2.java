package class_;

import java.util.Arrays;

/**
 * 2023-12-28
 */
public class SungJukMain2 {

    public static void main(String[] args) {
        /**
         * 객체 배열
         */
        SungJuk[] arr = new SungJuk[3];
        arr[0] = new SungJuk("홀길동", 80, 60, 90);
        arr[1] = new SungJuk("프로도", 80, 60, 40);
        arr[2] = new SungJuk("고길동", 92, 87, 93);
        
        // 계산
        for (SungJuk sungJuk : arr) {
            sungJuk.calc();
        }
        
        // 출력
        System.out.println("----------------------------------------------------");
        System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t학점");
        System.out.println("----------------------------------------------------");

        for (SungJuk sungJuk : arr) {
            System.out.printf("%s%5d\t\t%d\t\t%d\t\t%d\t\t%.2f\t%2s\n",
                    sungJuk.getName(),
                    sungJuk.getKor(),
                    sungJuk.getEng(),
                    sungJuk.getMath(),
                    sungJuk.getTot(),
                    sungJuk.getAvg(),
                    sungJuk.getGrade());
        }

    }
}
