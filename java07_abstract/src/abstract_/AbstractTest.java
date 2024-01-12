package abstract_;

/**
 * 2024-01-03
 */
public abstract class AbstractTest {
    /**
     * 추상 클래스 : 인스턴스 생성 불가, 추상 메서드를 포함하는 클래스를 의미. abstract 키워드를 붙임.
     * 추상 메서드 : 선언부만 정의되어 있고, abstract 키워드를 붙이고, 바디는 정의가 되지 않은 메서드.
     */

    protected String name;


    public String getName() {
        return name;
    }

    public abstract void setName(String name);
}

/**
 * POJO : Plain Old Java Object
 * - 순수한 자바 객체에 의존해 개발 > 한 기술에 종속되어서는 안된다는 지론.
 */