package net.acmicpc.silver.v;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소트인사이드
public class BOJ_1427_SortInside {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        br.readLine().chars().sorted().forEach(c -> ans.insert(0, (char) c));
        System.out.print(ans);
    }
}
