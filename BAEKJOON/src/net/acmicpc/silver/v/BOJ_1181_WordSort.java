package net.acmicpc.silver.v;

import java.io.*;
import java.util.Arrays;

// 단어 정렬
public class BOJ_1181_WordSort {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }
        br.close();
        Arrays.sort(words, (o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length());
        for (int i = 0; i < N; i++) {
            if (i > 0 && words[i].equals(words[i - 1])) {
                continue;   // 중복된 단어는 스킵
            }
            bw.write(words[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
