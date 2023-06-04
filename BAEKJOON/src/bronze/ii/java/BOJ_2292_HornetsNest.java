package bronze.ii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 벌집
public class BOJ_2292_HornetsNest {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        br.close();
        int cnt = 1;
        int range = 1;
        while (range < N) {
            range += 6 * cnt;
            cnt++;
        }
        System.out.println(cnt);
    }
}
