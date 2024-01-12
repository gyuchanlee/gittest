package inheritance;

/**
 * 2024-01-02
 */
public class ChildMain extends Super {

    protected String name;
    protected int age;

    public ChildMain() {
        System.out.println("ChildMain 기본 생성자");
    }

    public ChildMain(String name, int age, double weight, double height) {
        super(weight, height);
        System.out.println("ChildMain(n,a,w,h) 생성자");
        this.name = name;
        this.age = age;
    }

    // 오버라이드된 메서드가 우선권을 가짐. (자식이 먼저 우선권 가짐.)
    // 부모클래스의 접근제어자(protected)와 자식 클래스(public)이 달라도 된다 but 자식 클래스의 접근제어자가 더 넓은 범위여야 한다.
    @Override
    public void display() {
        System.out.println();
        System.out.println("이름 = " + name);
        System.out.println("나이 = " + age);
        System.out.println("몸무게 = " + weight);
        System.out.println("키 = " + height);
        System.out.println();
    }

    /**
     * 오버로드 : 메서드명은 같고, 매개변수의 개수, 타입, 순서가 달라야한다!!
     * - 리턴값은 아래와 같이 오버로드에 영향을 주지 않음!!
     */
    public void overload(int a, String b) {
        System.out.println("ChildMain.overload");
    }

    public int overload(int a, int b) {
        System.out.println("ChildMain.overload");
        return a;
    }

    public static void main(String[] args) {
        ChildMain childMain = new ChildMain();
        System.out.println("=====");

        ChildMain a = new ChildMain("홍길동", 28, 65, 174);
        a.display();

        ChildMain b = new ChildMain("옹길동", 25, 70, 185);
        b.display();
    }
}
