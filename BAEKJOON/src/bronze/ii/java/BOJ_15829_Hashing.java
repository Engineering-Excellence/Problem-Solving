package bronze.ii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Hashing
public class BOJ_15829_Hashing {

    private static long hashing(int length, char[] arr) {

        long r = 31;
        long M = 1234567891;
        long H = 0;
        long power = 1;

        for (int i = 0; i < length; i++) {
            H = (H + (arr[i] - 96) * power) % M;   // 나머지 연산의 분배법칙: (a + b) % c = (a % c + b % c) % c
            power = (power * r) % M;
        }

        return H;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int L = Integer.parseInt(br.readLine());
//        int[] a = br.readLine().chars().map(c -> c - 96).toArray();
        char[] a = br.readLine().toCharArray();
        System.out.print(hashing(L, a));
    }
}
