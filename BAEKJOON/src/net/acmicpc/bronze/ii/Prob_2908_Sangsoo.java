package net.acmicpc.bronze.ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob_2908_Sangsoo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));
        int num2 = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));
        System.out.println(Math.max(num1, num2));
    }
}
