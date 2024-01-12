package abstract_;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * 2024-01-03
 */
public class CalendarMain {

    public static void main(String[] args) {
        CalendarEx cal = new CalendarEx();
        cal.calc();
        cal.display();
    }
}

/**
 * [문제] 만년달력
 * - 년도, 월을 입력하여 달력을 작성하시오
 * - 기본생성자 : 입력
 * - 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
 *                 -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
 *          display() 출력
 *
 * [실행결과]
 * 년도 입력 : 2002
 * 월 입력 : 10
 *
 * 일	월	화	수	목	금	토
 * 		1	2	3	4	5
 * 6	7	8	9	10	11	12
 * 13	14	15	16	17	18	19
 * 20	21	22	23	24	25	26
 * 27	28	29	30	31
 *
 */

class CalendarEx {

    private LocalDate localDate; // LocalDate, java8
    private int firstDayWeek; // 첫날에 맞는 요일만큼 밀어낼 빈칸 수
    private int lastDay; // 마지막날
    private String[] days; // 날짜

    CalendarEx () {
        Scanner scn = new Scanner(System.in);
        System.out.print("년도 입력 : ");
        int year = scn.nextInt();
        System.out.print("월 입력 : ");
        int month = scn.nextInt();
        localDate = LocalDate.of(year, month, 1);
    }

    public void calc() {
        // 첫 시작날에 맞는 요일만큼 빈칸 밀기.
        firstDayWeek = localDate.getDayOfWeek().getValue();

        lastDay = localDate.lengthOfMonth();

        days = new String[firstDayWeek + lastDay];
        for (int i = 0; i < firstDayWeek; i++) {
            days[i] = " ";
        }
        for (int i = firstDayWeek; i < days.length; i++) {
            days[i] = Integer.toString(i - firstDayWeek + 1);
        }
    }

    public void display() {
        System.out.println("============================");
        System.out.println(" 일\t월\t화\t수\t목\t금\t토");

        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + "\t");
            // 달력 한 줄 띄우기용.
            if ((i + 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("============================");
    }
}