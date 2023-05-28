package net.acmicpc.bronze.v;

import java.io.*;

// N 찍기
public class BOJ_2741_PrintN {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
