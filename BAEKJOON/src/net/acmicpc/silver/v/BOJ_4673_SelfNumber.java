package net.acmicpc.silver.v;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// 셀프 넘버
public class BOJ_4673_SelfNumber {

    private static int d(int n) {

        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (sum < 10000) return sum;
        else return 0;
    }

    public static void main(String[] args) throws IOException {

        boolean[] isSelfNum = new boolean[10001];
        for (int i = 1; i < 10000; i++) {
            isSelfNum[d(i)] = true;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i < 10000; i++) {
            if (!isSelfNum[i]) bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
