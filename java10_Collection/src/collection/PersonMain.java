package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 2024-01-04
 */
public class PersonMain {

    public static ArrayList<PersonDTO> init() {
        PersonDTO aa = new PersonDTO("홍길동", 25);
        PersonDTO bb = new PersonDTO("프로도", 40);
        PersonDTO cc = new PersonDTO("무지", 30);

        ArrayList<PersonDTO> dtos = new ArrayList<>();
        dtos.add(aa);
        dtos.add(bb);
        dtos.add(cc);

        return dtos;
    }

    public static void main(String[] args) {

//        ArrayList<PersonDTO> dtos = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            dtos.add(new PersonDTO(i + "L", (i + 20)));
//        }
//
//        dtos.forEach(System.out::println);
//        System.out.println();
//
//        List<PersonDTO> filterDto = dtos.stream().filter(dto -> dto.getAge() > 21).toList();
//        filterDto.forEach(System.out::println);
//        System.out.println();

        ArrayList<PersonDTO> dtos = init();
//        System.out.println(dtos);
        dtos.stream().filter(dto -> dto.getAge() >= 30).forEach(System.out::println);

        List<PersonDTO> filterList = dtos.stream().filter(d -> d.getName().contains("무")).toList();
        System.out.println("filterList = " + filterList);

        long count = dtos.size();
        System.out.println(count);

        System.out.println("정렬 전");
        System.out.println(dtos);

        Collections.sort(dtos);

        System.out.println("정렬 후");
        System.out.println(dtos);

    }
}
