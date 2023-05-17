package net.acmicpc.silver.iii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기 4
public class Prob_11659_PrefixSum_4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        int[] sums = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            sums[i] = sums[i - 1] + Integer.parseInt(st.nextToken());
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            ans.append(-sums[Integer.parseInt(st.nextToken()) - 1] + sums[Integer.parseInt(st.nextToken())]).append("\n");
        }
        System.out.print(ans);
    }
}
