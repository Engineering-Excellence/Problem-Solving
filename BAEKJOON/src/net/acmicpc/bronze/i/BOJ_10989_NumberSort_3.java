package net.acmicpc.bronze.i;

import java.io.*;

// 수 정렬하기 3
public class BOJ_10989_NumberSort_3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];   // 카운트 배열 생성
        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(br.readLine())]++;   // 데이터의 등장 횟수 세기
        }
        br.close();
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
