package class2;

/**
 * 2024-01-02
 */
public class StaticMain {

    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        test.calc();
        test.disp();

        StaticTest test2 = new StaticTest();
        test2.calc();
        test2.disp();

        StaticTest test3 = new StaticTest();
        test3.calc();
        test3.disp();

        StaticTest.output(); // 스태틱 메서드 호출.
    }
}

class StaticTest {
    private int a; // 인스턴스 변수
    private static int b; // 클래스 변수 > 모든 클래스가 공유하는 값.

    StaticTest() {
        System.out.println("기본 생성자");
        this.a = 7;
    }

    public static void output() {
        System.out.println("b = " + b);
    }

    public void calc() {
        a++;
        b++;
    }

    public void disp() {
        System.out.println("a = " + a + " b = " + b);
    }

}
