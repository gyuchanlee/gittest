package dataStructure.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    int N; // 그래프 정점의 수
    List<Edge>[] graph;
    private boolean[] visited; // BFS 수행 중 방문한 정점의 원소를 true로 만든다.

    public BFS(List<Edge>[] adjList) {
        N = adjList.length;
        graph = adjList;
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            visited[i] = false; // 배열 초기화
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) bfs(i);
        }
    }

    private void bfs(int i) {
        Queue<Integer> q = new LinkedList<>(); // 큐 선언
        visited[i] = true;
        q.add(i); // 큐에 시작점 삽입
        while (!q.isEmpty()) {
            int j =q.remove(); // 큐에서 정점 j를 가져옴
            System.out.println(j + " "); // 정점 j 방문했다고 가정.
            for (Edge e : graph[j]) { // 정점 j에 인접한 정점 중 방문 안된 정점 하나씩 방문,
                if (!visited[e.adjvertex]) {
                    visited[e.adjvertex] = true;
                    q.add(e.adjvertex); // 방문할 정점을 큐에 삽입
                }
            }
        }
    }
}
