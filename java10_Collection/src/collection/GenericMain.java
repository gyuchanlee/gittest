package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 2024-01-08
 */
public class GenericMain<T> {

    private T age;

    // static 변수는 제네릭이 안되지만, static 메서드에는 메서드의 틀만 공유한 채로 쓸 수 있음.
    public static<T> List<T> method(T var) {
        return new ArrayList<T>();
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public static void main(String[] args) {
        /**
         * Generic : <T> T, V, P ...
         *
         * <T> Type (데이터형)
         * <E> Element (요소, 항목)
         * <K> Key
         * <V> Value
         *
         * 제네릭은 동적으로 타입을 결정하지 않고 컴파일 시 타입이 결정되므로 보다 안전한 프로그래밍이 가능하다
         * 실행 중에 타입 충돌 문제를 방지할 수 있다
         * 프로그램 개발 시 타입 캐스팅 절차가 필요 없어지고 ClassCastException을 방지 할 수 있다
         * 클래스 생성 시 타입을 명시해 준다.
         */

        GenericMain<String> genericMain = new GenericMain<>();
        genericMain.setAge("낄낄낄낄");
        System.out.println(genericMain.getAge());

        GenericMain<Integer> genericMain2 = new GenericMain<>();
        genericMain2.setAge(99);
        System.out.println(genericMain2.getAge());
    }
}
