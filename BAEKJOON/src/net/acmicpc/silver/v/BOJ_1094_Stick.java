package net.acmicpc.silver.v;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 막대기
public class BOJ_1094_Stick {

    /*private static int bitCount(int x) {
        if (x == 0) return 0;
        return x % 2 + bitCount(x / 2);
    }*/

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Integer.bitCount(Integer.parseInt(br.readLine())));
    }
}
