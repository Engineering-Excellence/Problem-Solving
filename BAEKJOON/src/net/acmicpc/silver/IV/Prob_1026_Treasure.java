package net.acmicpc.silver.IV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

// 보물
public class Prob_1026_Treasure {

    public static void main(String[] args) throws IOException {

//        System.setIn(new FileInputStream("BAEKJOON/sample_input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(N).sorted().toArray();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] B = IntStream.generate(() -> Integer.parseInt(st2.nextToken())).limit(N).sorted().toArray();

        System.out.println(IntStream.range(0, N).map(i -> A[i] * B[N - 1 - i]).sum());
    }
}
