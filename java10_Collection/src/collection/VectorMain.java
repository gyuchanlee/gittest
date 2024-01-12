package collection;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 */
public class VectorMain {

    public static void main(String[] args) {
        /**
         * List 구현 > 현재 ArrayList에 대체됨. > Thread-safe해서 동기화되있음 > 쓰레드 환경에서 사용하기 좋음.
         * 항상 동기화되므로 스레드 환경에서의 안정성은 높지만 ArrayList와 비교하여 추가, 검색, 삭제의 성능은 떨어지는 단점 존재.
         */

        Vector<String> vector = new Vector<>();
        System.out.println("벡터의 크기 : " + vector.size());
        System.out.println("벡터의 용량 : " + vector.capacity()); // default=10, 10씩 증가.
        System.out.println();

        System.out.println("항목 추가");
        for (int i = 0; i < 10; i++) {
            vector.add(i + "");
            System.out.print(vector.get(i) + " ");
        }
        System.out.println();
        System.out.println("벡터의 크기 : " + vector.size());
        System.out.println("벡터의 용량 : " + vector.capacity()); // default=10, 10씩 증가.
        System.out.println();

        // 항목 추가
        vector.addElement("5");
        System.out.println();
        vector.forEach((v) -> System.out.print(v + " "));
        System.out.println();
        System.out.println("벡터의 크기 : " + vector.size());
        System.out.println("벡터의 용량 : " + vector.capacity()); // default=10, 10씩 증가.
        System.out.println();

        System.out.println("마지막 항목 삭제");
//        vector.remove("5"); // 처음 만나는 "5"라는 값을 가진 요소를 먼저 삭제함
        vector.remove(vector.size() - 1);

        Iterator<String> iter = vector.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }
}
