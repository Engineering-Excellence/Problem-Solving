package bronze.iv.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 별 찍기 - 2
public class BOJ_2439_PrintStar_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            ans.append(" ".repeat(N - i)).append("*".repeat(i)).append("\n");
        }
        System.out.print(ans);
    }
}
