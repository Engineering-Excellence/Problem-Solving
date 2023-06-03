package silver.ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 유기농 배추
public class BOJ_1012_OrganicCabbage {

    static int M, N, K;
    static int[][] patch;   // 배추밭
    static boolean[][] visited;
    static final int[][] DIRS = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

    static boolean bfs(int x, int y) {
        if (visited[y][x]) return false;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : DIRS) {
                int nextX = curr[0] + dir[0];
                int nextY = curr[1] + dir[1];

                if (nextX >= 0 && nextX < M
                        && nextY >= 0 && nextY < N
                        && patch[nextY][nextX] == 1
                        && !visited[nextY][nextX]) {
                    queue.offer(new int[]{nextX, nextY});
                    visited[nextY][nextX] = true;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

//        System.setIn(new FileInputStream("BAEKJOON/sample_input.txt"));
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            patch = new int[N][M];
            visited = new boolean[N][M];

            for (int k = 0; k < K; k++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                patch[Y][X] = 1;
            }

            int worm = 0;   // 지렁이 수
            for (int y = 0; y < N; y++) {   // 배추밭의 모든 좌표에서 탐색 실행
                for (int x = 0; x < M; x++) {
                    if (patch[y][x] == 1 && bfs(x, y)) {
                        worm++;
                    }
                }
            }
            sb.append(worm).append("\n");
        }
        System.out.println(sb);
    }
}
