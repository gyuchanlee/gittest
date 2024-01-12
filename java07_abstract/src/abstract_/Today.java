package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * 2024-01-03
 */
public class Today {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd E요일 HH:mm:ss");
        System.out.println(date);
        System.out.println(format.format(date));
        System.out.println();

        // java8부터는 localDate, localTime 사용이 더 장점이 있어 권장함.
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd E요일 HH:mm:ss")));
        System.out.println();

        // 1991 07 16 10:25:37 형식 입력받기
        SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
        Date birth = input.parse("19910716102537");
        System.out.println(birth);
        System.out.println(format.format(birth));
        System.out.println();

        // 구현 클래스
//        Calendar calendar = new GregorianCalendar();
        // getInstance()
        Calendar calendar = Calendar.getInstance(Locale.KOREA);

//        System.out.println(calendar.getWeekYear());
//        System.out.println(calendar.getTimeZone());
//        System.out.println(calendar.getTimeInMillis());
//        System.out.println(calendar.get(Calendar.AM));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)); // 0으로 인덱스 시작
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // 1로 인덱스 시작
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 1로 인덱스 시작

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.println("일요일");
                break;
            case 2:
                System.out.println("월요일");
                break;
            case 3:
                System.out.println("화요일");
                break;
            case 4:
                System.out.println("수요일");
                break;
            case 5:
                System.out.println("목요일");
                break;
            case 6:
                System.out.println("금요일");
                break;
            default :
                System.out.println("토요일");

        }

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); // 인덱스 시작
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println();
    }
}
