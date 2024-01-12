package interface_;

/**
 * 2024-01-04
 */
public interface InterA {
    // 상수
    public static final String NAME = "홍길동";
    int AGE = 28;

    // 추상 메서드
    public abstract void aa();
    void bb();

    public default void defaultEx() {
        System.out.println("디폴트 메서드");
    }
}
