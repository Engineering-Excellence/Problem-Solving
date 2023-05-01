package net.acmicpc.silver.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팩토리얼 0의 개수
public class Prob_1676_FactorialNumZero {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            int n = i;
            while (n % 5 == 0) {
                n /= 5;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
