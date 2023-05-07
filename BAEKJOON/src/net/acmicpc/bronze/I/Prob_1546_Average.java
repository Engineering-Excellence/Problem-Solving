package net.acmicpc.bronze.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균
public class Prob_1546_Average {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        /*int max = Arrays.stream(scores).max().orElse(0);
        double avg = Arrays.stream(scores).average().orElse(0);
        System.out.print(avg / max * 100);*/

        int sum = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (max < scores[i]) max = scores[i];
            sum += scores[i];
        }
        System.out.println((double) sum / N / max * 100);
    }
}
