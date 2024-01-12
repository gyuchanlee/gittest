package collection;

import java.util.Stack;

/**
 * 2024-01-08
 */
public class StackMain {

    public static void main(String[] args) {
        /**
         * Stack
         * Vector(List)를 상속받아 구현
         * LIFO : 후입선출 (Last in First Out) >> 보관함 형식, 가장 늦게 들어온 값이 먼저 나감.
         *
         * - JVM 호출스택 (메서드의 작업공간. 메소드가 호출되면 호출 스택에 메모리 할당, 종료되면 사용하던 메모리를 반환함)
         * > 메서드 호출은 stack의 구조처럼 가장 늦게 호출된 메서드를 먼저 수행하고 소멸됨
         * > main()은 늘 호출스택 밑에 존재.
         */

        String[] groupA = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"};
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < groupA.length; i++) {
            stack.push(groupA[i]);
        }

        // 후입선출
        System.out.println("Stack = ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println("stack size = " + stack.size());
        }
        System.out.println();

    }
}
