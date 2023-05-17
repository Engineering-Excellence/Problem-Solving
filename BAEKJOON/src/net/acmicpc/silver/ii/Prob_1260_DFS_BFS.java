package net.acmicpc.silver.ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// DFS와 BFS
public class Prob_1260_DFS_BFS {

    static StringBuilder ans = new StringBuilder();

    static class Graph {

        private int[][] adj;
        private boolean[] visited;

        Graph(int N) {
            adj = new int[N + 1][N + 1];
            visited = new boolean[N + 1];
        }

        void DFS(int V) {
            visited[V] = true;
            ans.append(V).append(" ");

            for (int i = 1; i < adj.length; i++) {
                if (adj[V][i] == 1 && !visited[i]) DFS(i);
            }
        }

        void BFS(int V) {
            Queue<Integer> q = new LinkedList<>();
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

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        Graph g = new Graph(N);
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            g.adj[a][b] = g.adj[b][a] = 1;  // 양방향
        }

        g.DFS(V);
        ans.append("\n");

        Arrays.fill(g.visited, false);  // 방문 이력 초기화
        g.BFS(V);

        System.out.print(ans);
    }
}
