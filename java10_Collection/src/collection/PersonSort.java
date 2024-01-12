package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 2024-01-05
 */
public class PersonSort{

    public static void main(String[] args) {
        String[] arr = {"orange", "apple", "banana", "pear", "peach", "applemango"};

        System.out.println("정렬 전");
        for (String data : arr) {
            System.out.print(data + " ");
        }
        System.out.println();

        Arrays.sort(arr);

        System.out.println("정렬 후");
        for (String data : arr) {
            System.out.print(data + " ");
        }
        System.out.println();

        // 객체 비교
        PersonDTO aa = new PersonDTO("홍길동", 25);
        PersonDTO bb = new PersonDTO("프로도", 40);
        PersonDTO cc = new PersonDTO("무지", 30);

        ArrayList<PersonDTO> dtos = new ArrayList<>();
        dtos.add(aa);
        dtos.add(bb);
        dtos.add(cc);


        System.out.println("\n\n");
        System.out.println("================================================");
        System.out.println("정렬 전");
        System.out.println(dtos);
        // 나이 순 비교 / Integer 비교 사용.
        dtos.sort(Comparator.comparingInt(PersonDTO::getAge).reversed());
        System.out.println("================================================");
        System.out.println("정렬 후");
        System.out.println(dtos);


        System.out.println("\n\n");
        System.out.println("================================================");
        System.out.println("정렬 전");
        System.out.println(dtos);
        // 이름 오름차순 / 간단하게 원소 비교 가능 (String 가능)
        dtos.sort(Comparator.comparing(PersonDTO::getName).reversed());
        System.out.println("================================================");
        System.out.println("정렬 후");
        System.out.println(dtos);

    }
}

/**
 * 객체 비교
 * - Comparable
 * 기본 정렬 기준을 세우는 데 사용
 * Comparable은 "자기 자신과 매개변수 객체를 비교"
 *
 * - Comparator
 * 기본 정렬 기준 이외의 기준으로 소트할 때 사용
 * Comparator는 "두 매개변수 객체를 비교"
 */