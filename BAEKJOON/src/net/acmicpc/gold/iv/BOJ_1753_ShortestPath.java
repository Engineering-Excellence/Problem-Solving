package net.acmicpc.gold.iv;

import java.io.*;
import java.util.*;

// 최단경로
class Graph {

    private final int node;
    private final List<List<int[]>> graph;

    public Graph(int node) {
        this.node = node;
        graph = new ArrayList<>();
        for (int i = 0; i <= node; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int from, int to, int weight) {
        graph.get(from).add(new int[]{to, weight});
    }

    public void dijkstra(int start) throws IOException {

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(arr -> arr[1]));
        int[] distance = new int[node + 1];
        final int INF = Integer.MAX_VALUE;
        Arrays.fill(distance, INF); // 최단거리 초기화
        distance[start] = 0;    // 시작점에서 시작점까지의 거리는 0
        pq.offer(new int[]{start, 0});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            for (int[] next : graph.get(curr[0])) {
                if (distance[next[0]] > distance[curr[0]] + next[1]) {
                    distance[next[0]] = distance[curr[0]] + next[1];    // 더 짧은 거리를 발견시 최단거리 갱신
                    pq.offer(new int[]{next[0], distance[next[0]]});    // 우선순위 큐에 다음 노드와 새로운 거리를 추가
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= node; i++) {
            bw.write(distance[i] != INF ? distance[i] + "\n" : "INF\n");
        }
        bw.flush();
        bw.close();
    }
}

public class BOJ_1753_ShortestPath {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int V = Integer.parseInt(st.nextToken()); // 정점 개수
        final int E = Integer.parseInt(st.nextToken()); // 간선 개수
        final int K = Integer.parseInt(br.readLine());  // 시작 정점 번호
        Graph graph = new Graph(V);
        for (int i = 1; i <= E; i++) {
            st = new StringTokenizer(br.readLine());
            graph.addEdge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        br.close();
        graph.dijkstra(K);
    }
}
