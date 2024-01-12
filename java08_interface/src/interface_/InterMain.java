package interface_;

/**
 * 2024-01-04
 */
//public class InterMain implements InterA, InterB {
public class InterMain implements InterC { // 인터페이스의 다중 상속 활용

    @Override
    public void aa() {
        System.out.println("InterA 구현 -> aa()를 오버라이드");
    }

    @Override
    public void bb() {
        System.out.println("InterA 구현 -> bb()를 오버라이드");
    }

    @Override
    public void cc() {
        System.out.println("InterB 구현 -> cc() 오버라이드");
    }

    @Override
    public void dd() {
        System.out.println("InterB 구현 -> dd() 오버라이드");
    }

    public static void main(String[] args) {
        InterMain m = new InterMain();
        m.aa();
        m.bb();
        m.cc();
        m.dd();
    }
}

/**
 * 인터페이스 구현체가 오버라이드를 안하고 싶을 때!!!
 * - 그 구현체를 abstract 키워드로 추상 클래스로 만듬 > 재정의할 필요가 없음.
 * - 그 대신 그 부모의 자식이 상속받아서 메서드를 모두 오버라이드해줘야 함.
 */