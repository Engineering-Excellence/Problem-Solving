package graph.shortest_path;

import java.io.*;
import java.util.*;

// 최단경로
class Graph {

    private final int vertex;
    private final List<List<int[]>> graph;

    public Graph(int vertex) {
        this.vertex = vertex;
        graph = new ArrayList<>();
        for (int i = 0; i <= vertex; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int from, int to, int weight) {
        graph.get(from).add(new int[]{to, weight});
    }

    public void dijkstra(int start) throws IOException {

        int[] distance = new int[vertex + 1];
        final int INF = Integer.MAX_VALUE;
        Arrays.fill(distance, INF); // 최단거리 초기화
        distance[start] = 0;    // 시작점에서 시작점까지의 거리는 0

        AbstractQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(arr -> arr[1]));  // 거리를 우선순위로 오름차순 정렬
        pq.offer(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currVertex = curr[0];
            int currDistance = curr[1];

            if (distance[currVertex] < currDistance) {
                continue;   // 현재 노드까지의 최단거리가 이미 구해져 있는 경우 스킵
            }

            for (int[] next : graph.get(currVertex)) {
                int nextVertex = next[0];
                int nextDistance = next[1];
                if (distance[nextVertex] > distance[currVertex] + nextDistance) {
                    distance[nextVertex] = distance[currVertex] + nextDistance;    // 더 짧은 거리를 발견시 최단거리 갱신
                    pq.offer(new int[]{nextVertex, distance[nextVertex]});    // 우선순위 큐에 다음 노드와 새로운 거리를 추가
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= vertex; i++) {
            bw.write(distance[i] != INF ? distance[i] + "\n" : "INF\n");
        }
        bw.flush();
        bw.close();
    }
}

