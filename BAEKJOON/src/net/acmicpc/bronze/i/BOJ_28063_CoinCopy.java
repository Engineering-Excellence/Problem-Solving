package net.acmicpc.bronze.i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


// 동전 복사
public class BOJ_28063_CoinCopy {

    private static int solution(int N, int x, int y) {

        if (N == 1) {
            return 0;
        } else {
            int ans = 4;
            if (x == 1 || x == N) ans--;
            if (y == 1 || y == N) ans--;
            return ans;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.print(solution(N, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
}
