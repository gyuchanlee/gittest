package abstract_;

/**
 * 2024-01-03
 */
public class AbstractMain extends AbstractTest {

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        /**
         * 추상클래스는 단독으로 인스턴스 생성이 불가능.
         *
         * 추상 클래스 생성 방법
         * 1. 상속받은 클래스가 추상 메서드를 재정의하여(Override) 인스턴스 생성 (Inheritance)
         * 2. 메서드, getInstance()
         * 3.
         */

        AbstractTest at = new AbstractMain();
        at.setName("홍길동"); // 오버라이드된 메서드가 우선권을 가짐.
        System.out.println(at.getName());

    }
}
