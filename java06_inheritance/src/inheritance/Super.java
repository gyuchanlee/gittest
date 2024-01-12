package inheritance;


/**
 * 2024-01-02
 */
public class Super {
    private String notInheritance; // private은 상속을 막아줌.

    protected double weight;
    protected double height;

    public Super() {
        System.out.println("부모 클래스 기본 생성자");
    }

    protected Super(double weight, double height) {
        System.out.println("부모 클래스 생성자 super(w,h)");
        this.weight = weight;
        this.height = height;
    }

    protected void display() {
        System.out.println("weight = " + weight);
        System.out.println("height = " + height);
    }
}
