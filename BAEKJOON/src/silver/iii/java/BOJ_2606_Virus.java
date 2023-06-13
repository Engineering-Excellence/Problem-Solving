package silver.iii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 바이러스
public class BOJ_2606_Virus {

    static void dfs(List<List<Integer>> graph, int root, boolean[] visited) {

        visited[root] = true;
        for (int i = 0; i < graph.get(root).size(); i++) {
            int next = graph.get(root).get(i);
            if (!visited[next]) {
                dfs(graph, next, visited);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited = new boolean[n + 1];
        dfs(graph, 1, visited);
        int count = 0;
        for (int i = 2; i < n + 1; i++) {
            if (visited[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
