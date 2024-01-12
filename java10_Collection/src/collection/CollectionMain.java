package collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * 2024-01-04
 */
public class CollectionMain {

//    @SuppressWarnings("all")
    public static void main(String[] args) {

//        Collection list = new ArrayList<>();

        // ArrayList : 순서있음, 중복허용
        ArrayList<String> list = new ArrayList<>();
        list.add("호랑이");
        list.add("사자");
        list.add("호랑이");
        list.add(String.valueOf(12));
        list.add(String.valueOf(43.8));
        list.add("기린");
        list.add("코끼리");

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list[" + i + "] = " + list.get(i));
        }
        System.out.println();

        // 반복자 활용
        Iterator<String> it = list.iterator();
//        boolean hasNext = it.hasNext(); // 현재 위치에서 다음 항목이 있으면 True, 없으면 False
//        String next = it.next(); // 항목을 꺼내서 버퍼에 저장 후, 다음항목을 이동.
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
