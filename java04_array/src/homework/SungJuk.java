package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2023-12-27
 */
public class SungJuk {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        System.out.print("인원수 : ");
        int cnt = scn.nextInt();
        String[] name = new String[cnt];
        String[][] subject = new String[cnt][];
        int[][] jumsu = new int[cnt][];
        double[] avg = new double[cnt];
        int subjectCnt = 0;


        for (int i = 0; i < cnt; i++) {
            System.out.print("이름입력 : ");
            name[i] = scn.next();

            System.out.print("과목수 입력 : ");
            subjectCnt = scn.nextInt();

            subject[i] = new String[subjectCnt];
            for (int j = 0; j < subjectCnt; j++) {
                System.out.print("과목명 입력 : ");
                subject[i][j] = scn.next();
            }

            int tot = 0;
            jumsu[i] = new int[subjectCnt + 1];
            for (int j = 0; j < subjectCnt; j++) {
                System.out.print(subject[i][j] + " 점수 입력 : ");
                jumsu[i][j] = scn.nextInt();
                tot += jumsu[i][j];
            }
            jumsu[i][jumsu[i].length - 1] = tot;

            avg[i] = (double) tot / (jumsu[i].length - 1);

            System.out.println("-------------------------");
        }

//        System.out.println(Arrays.toString(name));
//        System.out.println(Arrays.deepToString(subject));
//        System.out.println(Arrays.deepToString(jumsu));
//        System.out.println(Arrays.toString(avg));

        // 출력
        System.out.println();
        for (int i = 0; i < cnt; i++) {
            System.out.print("이름\t");
            for (int j = 0; j < subject[i].length; j++) {
                System.out.printf(String.format("%4s\t", subject[i][j]));
            }
            System.out.print("총점\t\t");
            System.out.print("평균\n");

            System.out.print(name[i] + "\t");
            for (int j = 0; j < jumsu[i].length; j++) {
                System.out.printf(String.format("%4d\t", jumsu[i][j]));
            }
            System.out.printf(String.format("%4.2f\n", avg[i]));
            System.out.println();
        }


    }
}

/**
 * [문제] 성적 계산
 *
 * 인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
 * 평균은 소수이하 2째자리까지 출력
 *
 * [실행결과]
 * 인원수 : 2 (cnt)
 *
 * 이름입력 : 홍길동 (name)
 * 과목수 입력 : 2   (subjectCnt)
 * 과목명 입력 : 국어 (subject)
 * 과목명 입력 : 영어
 * 국어 점수 입력 : 95 (jumsu)
 * 영어 점수 입력 : 100
 * ---------------------
 * 이름입력 : 이기자
 * 과목수 입력 : 3
 * 과목명 입력 : 국어
 * 과목명 입력 : 영어
 * 과목명 입력 : 과학
 * 국어 점수 입력 : 95
 * 영어 점수 입력 : 100
 * 과학 점수 입력 : 90
 * ---------------------
 *
 * 이름     국어	  영어   총점     평균
 * 홍길동    95	  100   xxx	  xx.xx
 *
 * 이름		국어  영어   과학    총점      평균
 * 이기자	95   100   90	 xxx      xx.xx
 */