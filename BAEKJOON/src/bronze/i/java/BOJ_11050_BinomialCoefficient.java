package bronze.i.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이항 계수 1
public class BOJ_11050_BinomialCoefficient {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int res = 1;
        K = Math.min(K, N - K);
        for (int i = 0; i < K; i++) {
            res *= N - i;
            res /= i + 1;
        }
        System.out.print(res);
    }
}
