package silver.ii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 랜선 자르기
public class BOJ_1654_CutLAN {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int K = Integer.parseInt(st.nextToken());
        final int N = Integer.parseInt(st.nextToken());
        int[] lines = new int[K];
        int max = 0;

        for (int i = 0; i < K; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, lines[i]);
        }
        long left = 1;
        long right = max;
        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;
            for (int line : lines) {
                cnt += line / mid;
            }
            if (cnt >= N) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}
