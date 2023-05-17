package net.acmicpc.silver.iv;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// ATM
public class Prob_11399_ATM {

    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("BAEKJOON/sample_input.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] queue = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            queue[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(queue);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (N - i) * queue[i];
        }
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
