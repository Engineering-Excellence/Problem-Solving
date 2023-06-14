package silver.iii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// N과 M (1)
class Graph {

    private final int n;
    private final int m;
    private final boolean[] visited;
    private final int[] rs;
    final StringBuilder ans = new StringBuilder();

    public Graph(int n, int m) {
        this.n = n;
        this.m = m;
        visited = new boolean[n];
        rs = new int[n];
    }

    public void backtrack(int depth) {

        if (depth == m) {
            for (int i = 0; i < m; i++) {
                ans.append(rs[i]).append(" ");
            }
            ans.append("\n");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                rs[depth] = i + 1;
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}

public class BOJ_15649_NandM_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        Graph graph = new Graph(N, M);
        graph.backtrack(0);
        System.out.print(graph.ans);
    }
}
