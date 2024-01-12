package collection;

import java.util.HashMap;

/**
 * 2024-01-08
 */
public class MapMain {

    public static void main(String[] args) {

        /**
         * Map : 키 , 밸류 형식의 컬렉션. 키는 중복 불가하지만 밸류는 중복 가능
         * - HashTable, HashMap (해시테이블 이후버전, 단일 검색 우월),
         * TreeMap (이진트리, 정렬/범위검색), Properties (내부적으로 해시테이블 구현, String:String 형태)
         * LinkedHashMap : 순서대로 저장이 되는 map
         */

        HashMap<String, String> map = new HashMap<>();
        map.put("book101", "백설공주");
        map.put("book201", "인어공주");
        map.put("book102", "백설공주"); // Value 중복 허용
        map.put("book301", "피오나");
        map.put("book101", "엄지공주"); // Key 중복 불가 > 덮어버림.

        System.out.println(map.get("book101"));
        System.out.println(map.get("book102"));
        System.out.println(map.get("book201"));
        System.out.println(map.get("book301"));

        System.out.println();
        map.forEach((s, s2) -> System.out.println(s + " : " + s2));
    }
}
