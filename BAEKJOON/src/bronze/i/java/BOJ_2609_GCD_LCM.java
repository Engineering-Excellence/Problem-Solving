package bronze.i.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대공약수와 최소공배수
public class BOJ_2609_GCD_LCM {

    public static int getGCD(int a, int b) {

        if (b == 0) return a;
        return getGCD(b, a % b);
    }

    public static int getLCM(int a, int b) {

        return a * b / getGCD(a, b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        System.out.printf("%d%n%d", getGCD(n, m), getLCM(n, m));
    }
}
