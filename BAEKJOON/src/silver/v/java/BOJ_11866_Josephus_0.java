package silver.v.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

// 요세푸스 문제 0
public class BOJ_11866_Josephus_0 {

    private static String josephus(int n, int k) {

        Deque<Integer> queue = new ArrayDeque<>(n);
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll());
            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        System.out.print(josephus(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
}
