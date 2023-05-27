package net.acmicpc.bronze.i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린드롬 수
public class BOJ_1259_PalindromicNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;
            System.out.println(new StringBuilder(str).reverse().toString().equals(str) ? "yes" : "no");
        }
    }
}
