package net.acmicpc.silver.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 숨바꼭질
public class Prob_1697_HideAndSeek {

    static final int MAX = 100000;

    static int bfs(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[MAX + 1];

        queue.offer(n);
        visited[n] = true;

        int time = 0;

        while (!queue.isEmpty()) {
            for (int q = 0; q < queue.size(); q++) {
                int node = queue.poll();
                if (node == k) return time;
                if (node - 1 >= 0 && !visited[node - 1]) {
                    queue.offer(node - 1);
                    visited[node - 1] = true;
                }
                if (node + 1 <= MAX && !visited[node + 1]) {
                    queue.offer(node + 1);
                    visited[node + 1] = true;
                }
                if (2 * node <= MAX && !visited[2 * node]) {
                    queue.offer(2 * node);
                    visited[2 * node] = true;
                }
            }
            time++;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println(bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
}