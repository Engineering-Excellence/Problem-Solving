package net.acmicpc.silver.iv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 비밀번호 찾기
public class Prob_17219_FindPassword {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> pw = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int site = 0; site < n; site++) {
            st = new StringTokenizer(br.readLine());
            pw.put(st.nextToken(), st.nextToken());
        }

        for (int test = 0; test < m; test++) {
            ans.append(pw.get(br.readLine())).append("\n");
        }
        System.out.print(ans);
    }
}
