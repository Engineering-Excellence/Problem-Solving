package bronze.i.java;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

// 평균은 넘겠지
public class BOJ_4344_Average {

    public static void main(String[] args) throws IOException {

        System.setIn(new FileInputStream("BAEKJOON/sample_input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int C = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= C; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] scores = IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(N).toArray();
            double avg = Arrays.stream(scores).average().orElse(0);
            bw.write(String.format("%.3f%%%n", (double) Arrays.stream(scores).filter(score -> score > avg).count() / N * 100));
        }
        bw.flush();
        bw.close();
    }
}
