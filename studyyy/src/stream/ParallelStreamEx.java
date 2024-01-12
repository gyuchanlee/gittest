package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ParallelStreamEx {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("자바");
        list.add("람다");
        list.add("스트림");
        list.add("병렬처리");

        for (String data : list) {
            System.out.print(data + " ");
        }
        System.out.println();

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(name -> System.out.println(name + " : " + Thread.currentThread().getName()));
        // 병렬처리로 다른 스레드가 동시에 작업 처리 > 결과물이 계속 다름.
    }
}
