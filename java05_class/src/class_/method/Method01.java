package class_.method;

/**
 * 2023-12-28
 */
public class Method01 {

    public static void main(String[] args) {
        Method01 m = new Method01();
        System.out.println("객체 m = " + m);
        System.out.println("객체 m = " + m.toString());

        // 호출
        m.display();
        output(); // static
    }

    public void display() {
        System.out.println("Method01.display");
    }

    // static은 메서드영억(클래스,스태틱)에 처음에 만들어져 계속 공유되어짐.
    public static void output() {
        System.out.println("Method01.output (static)");
    }
}

/**
 * static method에는 this 사용 불가
 * - this는 object 객체 자신을 지정하는데, static은 객체를 만들지 않고 사용하는 것이므로 모순됨.
 *
 * 자바에서 모든 클래스는 기본적으로 Object 최상위 클래스를 상속을 받고 들어감.
 */