package dataStructure.graph;

import java.util.List;

public class DFS {
    /**
     *  깊이 우선 탐색
     *  - 임의의 정점에서 시작 > 이웃하는 정점에 방문, 그 정점의 이웃에 방문을 반복하여 모두 방문했을때 이전 정점으로 돌아가서 탐색
     *  - 실타래를 이용하여 미로 찾기와 같음. 실을 타고 가다가 길이 막히면 실을 감아 되돌아가 다른쪽으로 실을 풀면서 탐색을 진행.
     */

    int N; // 그래프 정점의 수
    List<Edge>[] graph;
    private boolean[] visited; // DFS 수행 중 방문한 정점을 true로.

    public DFS(List<Edge>[] adjList) {
        N = adjList.length;
        graph = adjList;
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            visited[i] = false; // 배열 초기화
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    private void dfs(int i) {
        visited[i] = true; // 정점 i를 방문하면 visited[i]를 true로
        System.out.println(i + " "); // 정점 i를 방문하였음을 출력
        for (Edge e : graph[i]) { // 정점 i에 인접한 각 정점에 대해
            dfs(e.adjvertex); // 정점 i에 인접한 정점을 방문 안 했으면 순환 호출
        }
    }
}
