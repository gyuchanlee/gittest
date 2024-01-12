package stream;

import java.util.ArrayList;

public class MapStream {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 85));
        list.add(new Student("홍길동", 92));
        list.add(new Student("홍길동", 87));

        list.stream().mapToInt(Student::getScore).forEach(System.out::println);
    }
}
