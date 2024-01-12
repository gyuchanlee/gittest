package inheritance;

/**
 * 2024-01-02
 */
public class SubMain extends Super {

    protected String name;
    protected int age;

    public SubMain() {
        // 부모 생성자 super() 호출 + 자기자신 생성자 호출.
        System.out.println("자식클래스 생성자 [기본]");
    }

    public SubMain(double weight, double height) {
        super(weight, height);
    }

    public SubMain(String name, int age, double weight, double height) {
        // super()은 언제나 생성자 첫 줄에 존재해야 함.
        super(weight, height);
        System.out.println("자식클래스 생성자 3");
        this.name = name;
        this.age = age;
//        super.weight = 999; // 부모의 참조값을 가질 수 있음.
    }

//    @Override
//    public void display() {
//        System.out.println();
//        super.display();
//        System.out.println();
//    }

    public void output() {
        System.out.println();
        System.out.println("이름 = " + name);
        System.out.println("나이 = " + age);
        System.out.println("몸무게 = " + weight);
        System.out.println("키 = " + height);
        System.out.println();
    }

    public static void main(String[] args) {
        Super subMain = new SubMain();
        subMain.display();
//        subMain.output();
        // 다형성 주의!!

        SubMain subMain2 = new SubMain("옹길동", 25, 70, 180);
        subMain2.display(); // 자식 클래스에 없을 시, 부모 클래스에 가서 검색함.
        subMain2.output();
    }
}
