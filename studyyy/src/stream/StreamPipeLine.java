package stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLine {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        double result = list.stream().mapToInt(Student::getScore).average().getAsDouble();
        System.out.println(result);
    }
}
