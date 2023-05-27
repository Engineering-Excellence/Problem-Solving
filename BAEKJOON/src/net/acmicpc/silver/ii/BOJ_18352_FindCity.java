package net.acmicpc.silver.ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 특정 거리의 도시 찾기
class Graph {

    private final int n;
    private final List<List<Integer>> graph;
    private static final int INF = Integer.MAX_VALUE;

    public Graph(int n) {
        this.n = n;
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int a, int b) {
        graph.get(a).add(b);
    }

    public void dijkstra(int start, int dist) {

        int[] distance = new int[n + 1];
        Arrays.fill(distance, INF); // 최단거리 초기화
        distance[start] = 0;    // 시작점에서 시작점까지의 거리는 0

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(arr -> arr[1]));
        pq.offer(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currVertex = curr[0];
            int currDistance = curr[1];

            if (distance[currVertex] < currDistance) {
                continue;   // 현재 노드까지의 최단거리가 이미 구해져 있는 경우 스킵
            }

            for (int next : graph.get(currVertex)) {
                int newDistance = distance[currVertex] + 1;

                if (newDistance < distance[next]) {
                    distance[next] = newDistance;   // 더 짧은 거리가 발견되면 최단거리 갱신
                    pq.offer(new int[]{next, newDistance});  // 우선순위 큐에 다음 노드와 새로운 거리를 추가
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (distance[i] == dist) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb.length() != 0 ? sb : -1);
    }
}

public class BOJ_18352_FindCity {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken()); // 도시 개수
        final int M = Integer.parseInt(st.nextToken()); // 도로 개수
        final int K = Integer.parseInt(st.nextToken()); // 거리 정보
        final int X = Integer.parseInt(st.nextToken()); // 출발 도시 번호

        Graph graph = new Graph(N);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            graph.addEdge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        br.close();

        graph.dijkstra(X, K);
    }
}
