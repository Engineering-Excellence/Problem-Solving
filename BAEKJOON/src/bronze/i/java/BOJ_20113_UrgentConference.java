package bronze.i.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 긴급 회의
public class BOJ_20113_UrgentConference {

    public static void main(String[] args) throws IOException {

        String ans = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int[] players = new int[N + 1];
        int max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            players[Integer.parseInt(st.nextToken())]++;
        }
        for (int i = 1; i <= N; i++) {
            if (players[i] > max) {
                max = players[i];
                ans = String.valueOf(i);
            } else if (players[i] == max) {
                ans = "skipped";
            }
        }
        System.out.print(ans);
    }
}
