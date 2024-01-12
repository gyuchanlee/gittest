package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 2024-01-08
 */
public class SetMain {

    public static void main(String[] args) {

        /**
         * Set : 값 중복이 없고, 순서가 없는 컬렉션.
         * HashSet, TreeSet (이진트리, 검색), LinkedHashSet (순서있음)
         */

        Set<String> hashSet = new HashSet<>();
        hashSet.add("호랑이");
        hashSet.add("사자");
        hashSet.add("호랑이"); // 중복 X
        hashSet.add("기린");
        hashSet.add("물소");
        hashSet.add("코요테");

        // 순서 보장 X
        Iterator<String> iter = hashSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
