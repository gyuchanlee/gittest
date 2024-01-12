package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 2024-01-08
 */
public class QueueMain {

    public static void main(String[] args) {
        /**
         * Queue
         * LinkedList가 Queue 인터페이스 구현.
         * FIFO : 선입선출 (First In First Out) >> 터널형식, 가장 먼저 들어온 값이 먼저 나감
         *
         * >> 구현 이유 : Queue는 늘 가장 먼저 온 데이터가 나가야하므로 순차적인 ArrayList는 첫번째 값을 지우고 계속 배열을 복사해 덮어씌워 성능이 좋지않다.
         * 따라서 링크만 끊어서 특정 노드를 삭제를 하면 되는 LinkedList가 구현에 유리함
         * * ArrayList : 순차적 추가,삭제에는 유리
         * * LinkedList : 처음, 중간 데이터 추가/삭제에 유리 (노드 사이의 링크를 끊거나 추가하기만 하면 되기 때문.)
         */

        String[] groupA = {"스타렉스", "닷지", "육공", "레토나"};
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < groupA.length; i++) {
            queue.offer(groupA[i]);
        }

        // 선입선출
        System.out.println("Queue = ");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
            System.out.println("queue size = " + queue.size());
        }

    }
}
