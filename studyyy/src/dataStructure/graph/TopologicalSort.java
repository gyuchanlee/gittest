package dataStructure.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TopologicalSort {
    int N; // 그래프의 정점 수
    boolean[] visited; // DFS 수행 중 방문 여부 체크 용
    List<Integer>[] adjList; // 인접 리스트 형태의 입력 그래프
    List<Integer> sequence; // 위상 정렬 순서를 담을 리스트

    public TopologicalSort(List<Integer>[] graph) {
        N = graph.length;
        visited = new boolean[N];
        adjList = graph;
        sequence = new ArrayList<>();
    }

    public List<Integer> tsort() {
        // 위상 정렬
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }
        Collections.reverse(sequence); // sequnce를 역순으로 > 역방향 방법(위상 정렬)
        return sequence;
    }

    public void dfs(int i) {
        // DFS 수행
        visited[i] = true;
        for (int v : adjList[i]) {
            // i의 방문이 끝나고 앞으로 방문해야할 각 정점 v에 대해
            if (!visited[v]) {
                dfs(v);
            }
            sequence.add(i); // i에 진출하는 간선이 더이상 없으므로 i를 sequence에 추가.
        }
    }

}
