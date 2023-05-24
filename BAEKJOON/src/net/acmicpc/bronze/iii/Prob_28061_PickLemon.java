package net.acmicpc.bronze.iii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 레몬 따기
public class Prob_28061_PickLemon {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, Integer.parseInt(st.nextToken()) - (n - i));
        }
        System.out.print(max);
    }
}
