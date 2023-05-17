package net.acmicpc.silver.ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 좌표 압축
public class Prob_18870_CoordinateCompression {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }
        int[] sorted = x.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int k : sorted) {
            if (!map.containsKey(k)) {
                map.put(k, rank++);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int k : x) {
            ans.append(map.get(k)).append(" ");
        }
        System.out.print(ans);
    }
}
