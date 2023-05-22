package net.acmicpc.bronze.i;

import java.io.*;
import java.util.StringTokenizer;

// 최소공배수
public class Prob_1934_LCM {

    public static int getGCD(int n, int m) {

        if (m == 0) return n;
        return getGCD(m, n % m);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            bw.write(n * m / getGCD(n, m) + "\n");
        }
        bw.flush();
    }
}
