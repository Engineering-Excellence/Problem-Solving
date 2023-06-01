package net.acmicpc.silver.v;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 단어 정렬
public class BOJ_1181_WordSort {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        final int N = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();
        for (int i = 0; i < N; i++) words.add(br.readLine());
        br.close();
        words.stream().sorted((o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length()).forEach(s -> ans.append(s).append("\n"));
        System.out.print(ans);
    }
}
