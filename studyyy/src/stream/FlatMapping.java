package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapping {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best driver in the world");
        list1.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(System.out::println);
        System.out.println();

        List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
        list2.stream()
                .flatMapToInt(data -> {
                    String[] split = data.split(",");
                    int[] newArr = new int[split.length];
                    for (int i = 0; i < newArr.length; i++) {
                        newArr[i] = Integer.parseInt(split[i].trim());
                    }
                    return Arrays.stream(newArr);
                })
                .forEach(System.out::println);
    }
}
