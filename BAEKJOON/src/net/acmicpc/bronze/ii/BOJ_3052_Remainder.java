package net.acmicpc.bronze.ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 나머지
public class BOJ_3052_Remainder {

    public static void main(String[] args) throws IOException {

        Set<Integer> remainders = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            remainders.add(Integer.parseInt(br.readLine()) % 42);
        }
        br.close();
        System.out.print(remainders.size());
    }
}
