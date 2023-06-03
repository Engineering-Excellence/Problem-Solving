package bronze.i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 0의 개수
public class BOJ_11170_ZeroCount {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();

        for (int test_case = 0; test_case < T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt = 0;
            for (int i = n; i <= m; i++) {
                cnt += String.valueOf(i).length() - String.valueOf(i).replace("0", "").length();
            }
            ans.append(cnt).append("\n");
        }
        System.out.print(ans);
    }
}
