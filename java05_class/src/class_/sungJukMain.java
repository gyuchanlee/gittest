package class_;

import java.util.Scanner;

/**
 * 2023-12-28
 */
public class sungJukMain {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        SungJuk sungJuk = new SungJuk();
        sungJuk.setData("홍길동", 90, 95, 100);
        sungJuk.calc();

        // 출력
        System.out.println("----------------------------------------------------");
        System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t학점");
        System.out.println("----------------------------------------------------");
        printScore(sungJuk);


        SungJuk sungJuk2 = new SungJuk();
        sungJuk2.setData("라이언", 80, 65, 72);
        sungJuk2.calc();
        // 출력
        printScore(sungJuk2);


        SungJuk sungJuk3 = new SungJuk();
        sungJuk3.setData("바비킴", 73, 68, 52);
        sungJuk3.calc();
        // 출력
        printScore(sungJuk3);
    }

    private static void printScore(SungJuk sungJuk) {
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

/**
 * [문제] 성적처리
 * 클래스명 : SungJuk
 * 필드 : name, kor, eng, math, tot, avg, grade
 * 메소드 : setData(이름, 국어, 영어, 수학)
 *        calc() - 총점, 평균, 학점 계산
 * 	   getName()
 * 	   getKor()
 * 	   getEng()
 * 	   getMath()
 *        getTot()
 *        getAvg()
 *        getGrade()
 *
 * 클래스명 : SungJukMain
 *
 * [실행결과]
 * ----------------------------------------------------
 * 이름		국어		영어		수학		총점		평균		학점
 * ----------------------------------------------------
 * 홍길동	90		95		100
 */