package net.acmicpc.bronze.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 포인트 카드
public class Prob_14471_PointCard {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] costs = new int[m];
        int ans = 0;

        for (int card = 0; card < m; card++) {
            st = new StringTokenizer(br.readLine());
            int stamp = Integer.parseInt(st.nextToken());
            if (stamp < n) costs[card] = n - stamp;
        }
        Arrays.sort(costs);

        for (int card = 0; card < m - 1; card++) {
            ans += costs[card];
        }
        System.out.print(ans);
    }
}
