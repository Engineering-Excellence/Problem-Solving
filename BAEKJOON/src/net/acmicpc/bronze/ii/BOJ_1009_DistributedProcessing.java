package net.acmicpc.bronze.ii;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

// 분산처리
public class BOJ_1009_DistributedProcessing {

    static int a, b, res;

    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("BAEKJOON/sample_input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder ans = new StringBuilder();

        for (int test_case = 1; test_case <= T; test_case++) {

            String[] input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            res = a % 10;

            for (int i = 1; i < b; i++) {
                res = (res * (a % 10)) % 10;
            }
            ans.append(res != 0 ? res : 10).append("\n");
        }
        System.out.print(ans);
    }
}
