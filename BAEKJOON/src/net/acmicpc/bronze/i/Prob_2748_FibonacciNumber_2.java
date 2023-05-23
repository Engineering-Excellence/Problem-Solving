package net.acmicpc.bronze.i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 2
public class Prob_2748_FibonacciNumber_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long a = 0;
        long b = 1;
        long ans = 0;

        int i = 0;
        while (++i < n) {
            ans = a + b;
            long temp = b;
            b = b + a;
            a = temp;
        }
        System.out.print(n == 1 ? 1 : ans);
    }
}
