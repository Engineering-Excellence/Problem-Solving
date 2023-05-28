package net.acmicpc.bronze.ii;

import java.io.*;
import java.util.StringTokenizer;

// 바구니 뒤집기
public class BOJ_10811_ReverseBasket {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        int[] baskets = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            baskets[i] = i;
        }
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            while (i < j) {
                int temp = baskets[i];
                baskets[i++] = baskets[j];
                baskets[j--] = temp;
            }
        }
        br.close();
        for (int i = 1; i <= N; i++) {
            bw.write(baskets[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
