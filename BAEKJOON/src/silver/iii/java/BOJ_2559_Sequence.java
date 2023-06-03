package silver.iii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 수열
public class BOJ_2559_Sequence {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int K = Integer.parseInt(st.nextToken());

        int[] celsius = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            celsius[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += celsius[i];
        }

        int max = sum;
        for (int i = K; i < N; i++) {
            sum += celsius[i];
            sum -= celsius[i - K];
            max = Math.max(max, sum);
        }
        System.out.print(max);
    }
}
