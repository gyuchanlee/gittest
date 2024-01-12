package multi;

import java.util.ArrayList;
import java.util.List;

/**
 * 2023-12-27
 */
public class MultiArray04 {

    public static void main(String[] args) {

        String[] name = {"홍길동", "프로도", "라이언", "왕밤빵"};
        int[][] jumsu = {{90, 95, 100, 0}, {100, 89, 75, 0}, {75, 80, 48, 0}, {100, 100, 100, 0}};
        double[] avg = new double[jumsu.length];
        String[] grade = new String[jumsu.length];

        // 총점, 평균, 학점 계산
        for (int i = 0; i < jumsu.length; i++) {
            int tot = 0;
            double average = 0.0;
            for (int j = 0; j < jumsu[i].length - 1; j++) {
                tot += jumsu[i][j];
            }
            jumsu[i][jumsu[i].length - 1] = tot;

            average = tot / 3.0;
            avg[i] = average;

            if (avg[i] >= 90) {
                grade[i] = "A";
            } else if (avg[i] >= 80) {
                grade[i] = "B";
            } else if (avg[i] >= 70) {
                grade[i] = "C";
            } else if (avg[i] >= 60) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }


        System.out.println("---------------------------------------------------------");
        System.out.println(" 이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t 학점");
        for (int i = 0; i < jumsu.length; i++) {
            System.out.printf("%s\t\t%d\t\t%d\t\t%d\t\t%d\t\t%.2f\t  %s\n",
                    name[i], jumsu[i][0], jumsu[i][1], jumsu[i][2], jumsu[i][3], avg[i], grade[i]);
        }
        System.out.println("---------------------------------------------------------");

    }
}

/**
 *
 * 성적 계산
 * 학점 - 평균 90이상 A, 80 이상이면 B, 70 이상 C, 60이상 D, 나머지 F
 *
 * ----------------------------------------------------
 * 이름		국어		영어		수학		총점		평균		학점
 * ----------------------------------------------------
 * 홍길동	90		95		100
 * 프로도	100		89		75
 * 라이언	75		80		48
 * ----------------------------------------------------
 */