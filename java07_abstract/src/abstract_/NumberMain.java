package abstract_;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

/**
 * 2024-01-03
 */
public class NumberMain {

    public static void main(String[] args) {

        /**
         * 추상 클래스 생성 방법
         * 1. 상속받은 클래스가 추상 메서드를 재정의하여(Override) 인스턴스 생성 (Inheritance)
         * 2. 메서드. getInstance() 메서드 활용.
         * 3.
         */

        // 구현 클래스 활용
        NumberFormat nf = new DecimalFormat();
        System.out.println(nf.format(12345678.456789));
        System.out.println(nf.format(12345678));
        System.out.println();

        NumberFormat nf2 = new DecimalFormat("#,###.##원");
        System.out.println(nf2.format(12345678.456789));
        System.out.println(nf2.format(12345678));
        System.out.println();

        NumberFormat nf3 = new DecimalFormat("#,###.00원");
        System.out.println(nf3.format(12345678.456789));
        System.out.println(nf3.format(12345678));
        System.out.println();

        // 추상클래스 생생 메서드 활용
//        NumberFormat nf4 = NumberFormat.getInstance();
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US); // 나라별 화폐단위 찍기
        nf4.setMaximumFractionDigits(2);
        nf4.setMinimumFractionDigits(2);
        System.out.println(nf4.format(12345678.456789));
        System.out.println(nf4.format(12345678));
        System.out.println();

        NumberFormat nf5 = NumberFormat.getInstance(Locale.FRENCH);
        nf5.setMaximumFractionDigits(2);
        nf5.setMinimumFractionDigits(2);
        System.out.println(nf5.format(12345678.456789));
        System.out.println(nf5.format(12345678));
        System.out.println();
    }
}
