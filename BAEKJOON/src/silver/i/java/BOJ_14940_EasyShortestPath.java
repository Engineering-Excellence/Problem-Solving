package silver.i.java;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

// 쉬운 최단거리
public class BOJ_14940_EasyShortestPath {

    private static final int[][] DIRECTIONS = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    private static void bfs(int[][] map, Queue<Point> queue, int n, int m) {
        while (!queue.isEmpty()) {
            Point curr = queue.poll();
            for (int[] dir : DIRECTIONS) {
                int nx = curr.x + dir[0];
                int ny = curr.y + dir[1];
                if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                if (map[ny][nx] == 1) {
                    map[ny][nx] = map[curr.y][curr.x] + 1;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][m];
        Queue<Point> queue = new ArrayDeque<>();

        for (int y = 0; y < n; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 0; x < m; x++) {
                map[y][x] = Integer.parseInt(st.nextToken());
                if (map[y][x] == 2) {
                    queue.offer(new Point(x, y));
                }
            }
        }
        br.close();

        bfs(map, queue, n, m);

        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {
                if (map[y][x] >= 2) sb.append(map[y][x] - 2).append(" ");   // 최단 거리 출력(시작점: 2)
                else if (map[y][x] == 1) sb.append(-1).append(" "); // 벽인 경우
                else sb.append(0).append(" ");  // 갈 수 없는 경우
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
