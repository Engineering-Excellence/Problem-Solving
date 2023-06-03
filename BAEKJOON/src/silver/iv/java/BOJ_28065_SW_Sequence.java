package silver.iv.java;

import java.io.*;

// SW 수열 구하기
public class BOJ_28065_SW_Sequence {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int sw = 1;
        int seq = 1;
        if (n % 2 == 0) {
            sw = -1;
            seq = n;
        }

        for (int i = 1; i <= n; i++) {
            bw.write(seq + " ");
            seq = seq + sw * (n - i);
            sw *= -1;
        }
        bw.flush();
    }
}