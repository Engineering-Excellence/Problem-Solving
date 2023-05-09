package net.acmicpc.bronze.II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수
public class Prob_2747_FibonacciNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Integer.parseInt(br.readLine());

        System.out.print((long) ((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5)));
    }
}
