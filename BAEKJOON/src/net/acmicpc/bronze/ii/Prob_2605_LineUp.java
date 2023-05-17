package net.acmicpc.bronze.ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 줄 세우기
public class Prob_2605_LineUp {

    public static void main(String[] args) throws IOException {

//        System.setIn(new FileInputStream("BAEKJOON/sample_input.txt"));
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> lineUp = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            lineUp.add(i - Integer.parseInt(st.nextToken()), i + 1);
        }
        lineUp.forEach(i -> sb.append(i).append(" "));
        System.out.println(sb.toString().trim());
    }
}
