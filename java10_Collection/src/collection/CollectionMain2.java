package collection;

import java.util.ArrayList;

/**
 * 2024-01-04
 */
public class CollectionMain2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("호랑이");
        list.add("사자");
        list.add("호랑이");
        list.add(String.valueOf(12));
        list.add(String.valueOf(43.8));
        list.add("기린");
        list.add("코끼리");

        list.forEach(System.out::println);
    }
}
