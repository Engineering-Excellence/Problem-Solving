package net.acmicpc.bronze.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A/B
public class Prob_1008_AdivideB {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.print(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken()));
    }
}