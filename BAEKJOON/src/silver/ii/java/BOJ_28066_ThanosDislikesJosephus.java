package silver.ii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 타노스는 요세푸스가 밉다
public class BOJ_28066_ThanosDislikesJosephus {

    private static int solution(int N, int K) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        int ans;
        while (true) {
            ans = queue.poll();
            for (int i = 0; i < K - 1; i++) {
                if (queue.isEmpty()) return ans;
                queue.poll();
            }
            queue.offer(ans);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int K = Integer.parseInt(st.nextToken());
        System.out.print(solution(N, K));
    }
}
