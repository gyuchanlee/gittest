package homework;

/**
 * 2024-01-02
 */
public class Fruit {

    private String pum;
    private int jan;
    private int feb;
    private int mar;
    private int tot;
    private static int sumJan = 0;
    private static int sumFeb = 0;
    private static int sumMar = 0;

    public Fruit(String pum, int jan, int feb, int mar) {
        this.pum = pum;
        this.jan = jan;
        this.feb = feb;
        this.mar = mar;
    }

    public void calcTot() {
        tot = jan + feb + mar;
        sumJan += jan;
        sumFeb += feb;
        sumMar += mar;
    }

    public void display() {
        System.out.printf(" %s    %3d    %3d    %3d     %3d\n", pum, jan, feb, mar, tot);
    }

    public static void output() {
        System.out.printf("        %4d   %4d   %4d\n", sumJan, sumFeb, sumMar);
    }
}

/**
 *
 * 클래스 : Fruit
 * pum, jan, feb, mar, tot
 * sumJan, sumFeb, sumMar
 *
 * 생성자(품명, 1월, 2월, 3월)
 * calcTot()
 * display()
 * public static void output()
 *
 *  * ---------------------------------
 *  * PUM		JAN   FEB   MAR		TOT
 *  * ---------------------------------
 *  * 사과    100    80    75     255
 *  * 포도     30    25    10     xxx
 *  * 딸기     25    30    90     xxx
 *  * ---------------------------------
 *  *         xxx   xxx   xxx				output()로 처리
 */
