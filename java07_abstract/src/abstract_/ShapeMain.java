package abstract_;

import java.io.IOException;
import java.util.Scanner;

/**
 * 2024-01-03
 */
public class ShapeMain {

    public static void main(String[] args) throws IOException {

        System.out.println("계산할 도형을 입력");
        System.out.print("(1.삼각형 2.사각형 3.사다리꼴) : ");
        int input = System.in.read() - '0';
        ShapeTest test = null;

        // 부모 클래스를 변수로 활용 > 결합도 낮추기, 다형성, 부모 = 자식 대입.
        if (input == 1) {
            test = new SamTest();
        } else if (input == 2) {
            test = new SaTest();
        } else if (input == 3) {
            test = new SadariTest();
        }

        if (test != null) {
            test.calcArea();
            test.displayArea();
            System.out.println(test.area);
        } else {
            System.out.println("Null 오류");
        }
    }
}

abstract class ShapeTest {
    protected double area;
    protected Scanner scn = new Scanner(System.in);

    public ShapeTest() {
        System.out.println("ShapeTest 기본 생성자");
    }

    public abstract void calcArea();
    
    public abstract void displayArea();
}

class SamTest extends ShapeTest {
    private int base;
    private int height;

    public SamTest() {
        System.out.println("SamTest 기본생성자");
        System.out.print("밑변 : " );
        base = scn.nextInt();
        System.out.print("높이 : " );
        height = scn.nextInt();
    }

    // 오버라이드 어노테이션으로 컴파일 과정에서 오버라이드를 했는지 검사하도록 함.
    @Override
    public void calcArea() {
        area = base * height / 2.0;
    }

    @Override
    public void displayArea() {
        System.out.println("삼각형의 넓이 = " + area);
    }
}

class SaTest extends ShapeTest {
    protected int width;
    protected int height;
    
    SaTest() {
        System.out.println("saTest 기본생성자");
        System.out.print("가로 : " );
        width = scn.nextInt();
        System.out.print("높이 : " );
        height = scn.nextInt();
    }

    @Override
    public void calcArea() {
        area = width * height;
    }

    @Override
    public void displayArea() {
        System.out.println("사각형의 넓이 = " + area);
    }
}

class SadariTest extends ShapeTest {
    protected int top;
    protected int bottom;
    protected int height;

    SadariTest() {
        System.out.println("SadariTest 기본생성자");
        System.out.print("위 : " );
        top = scn.nextInt();
        System.out.print("아래 : " );
        bottom = scn.nextInt();
        System.out.print("높이 : " );
        height = scn.nextInt();
    }

    @Override
    public void calcArea() {
        area = (top + bottom) * height / 2.0;
    }

    @Override
    public void displayArea() {
        System.out.println("사다리꼴의 넓이 = " + area);
    }
}