package graph.etc;

import java.util.ArrayDeque;
import java.util.Deque;

// DFS와 bfs
class DFS_BFS {

    static StringBuilder ans = new StringBuilder();

    static class Graph {

        private int[][] adj;
        private boolean[] visited;

        Graph(int N) {
            adj = new int[N + 1][N + 1];
            visited = new boolean[N + 1];
        }

        void dfs(int V) {
            visited[V] = true;
            ans.append(V).append(" ");

            for (int i = 1; i < adj.length; i++) {
                if (adj[V][i] == 1 && !visited[i]) dfs(i);
            }
        }

        void bfs(int V) {
            Deque<Integer> q = new ArrayDeque<>();
            q.offer(V);
            visited[V] = true;
            ans.append(V).append(" ");

            while (!q.isEmpty()) {
                int node = q.poll();
                for (int i = 1; i < adj.length; i++) {
                    if (adj[node][i] == 1 && !visited[i]) {
                        q.offer(i);
                        visited[i] = true;
                        ans.append(i).append(" ");
                    }
                }
            }
        }
    }
}
