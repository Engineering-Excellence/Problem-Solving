package net.acmicpc.bronze.I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 단어순서 뒤집기
public class Prob_12605_ReverseWords {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            List<String> words = Arrays.asList(br.readLine().split(" "));
            Collections.reverse(words);
            sb.append(String.format("Case #%d:", i));
            words.forEach(s -> sb.append(" ").append(s));
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
