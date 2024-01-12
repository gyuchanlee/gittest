package nested;

/**
 * 2024-01-08
 */
public class Outer {

    private String name;

    public void output() {
        System.out.println("이름 = " + name + " 나이 = " + new Inner().age);
    }

    public static void main(String[] args) {

        // Outer 클래스는 자신의 것만 생성
        Outer outer = new Outer();
        outer.name = "Lee";
        outer.output();
        
        // 내부 클래스 생성
        Outer.Inner inner = outer.new Inner(); // 중첩된 내부 클래스임을 명시.
        inner.age = 28;
        inner.display();

//        inner.name = "코난"; // 접근 불가

        Inner inner2 = outer.new Inner();
        inner2.age = 30;
        inner2.display();

        Inner inner3 = new Outer().new Inner();

        inner3.age = 99;
        inner3.display();


    }


    class Inner {
        private int age;

        public void display() {
            System.out.println("이름 = " + Outer.this.name + " 나이 = " + age);
        }


    }
}
