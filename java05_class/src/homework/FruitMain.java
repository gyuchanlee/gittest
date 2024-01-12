package homework;

/**
 * 2024-01-02
 */
public class FruitMain {

    public static void main(String[] args) {

        Fruit apple = new Fruit("사과", 100, 80, 75);
        Fruit grape = new Fruit("포도", 30, 25, 10);
        Fruit strawberry = new Fruit("딸기", 25, 30, 90);
        apple.calcTot();
        grape.calcTot();
        strawberry.calcTot();

        // 출력
        System.out.println(" ---------------------------------");
        System.out.println(" PUM\tJAN     FEB    MAR\t  TOT");
        apple.display();
        grape.display();
        strawberry.display();
        System.out.println(" ---------------------------------");
        Fruit.output();
    }
}

/**
 * 과일 판매량 구하기
 * 월별 매출합계도 구하시오
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
 * 클래스 : FruitMain
 *
 * [실행결과]
 * ---------------------------------
 * PUM		JAN   FEB   MAR		TOT
 * ---------------------------------
 * 사과    100    80    75     255
 * 포도     30    25    10     xxx
 * 딸기     25    30    90     xxx
 * ---------------------------------
 *         xxx   xxx   xxx				output()로 처리
 */