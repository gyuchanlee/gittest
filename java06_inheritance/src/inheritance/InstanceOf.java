package inheritance;

/**
 * 2024-01-09
 */
public class InstanceOf {

    public static void main(String[] args) {

        Child child = new Child();
        Parent parent = new Parent();
        Parent pp = new Child();
        Child child2 = child;
        System.out.println(child instanceof Parent); // true
        System.out.println(child instanceof Child); // true
        System.out.println(pp instanceof Parent); // true
        System.out.println(pp instanceof Child); // true
        System.out.println(parent instanceof Parent); // true
        System.out.println(parent instanceof Child); // false
        System.out.println(child2 instanceof Parent); // true
        System.out.println(child2 instanceof Child); // true

        // 타겟 객체가 해당 클래스로 형변환이 가능한지 여부를 알려주는 연산자.
    }
}


class Parent {}

class Child extends Parent {}