package net.acmicpc.bronze.ii;

import java.io.*;

// 숫자의 개수
public class BOJ_2577_NumberCount {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        while (result > 0) {
            arr[result % 10]++;
            result /= 10;
        }

        for (int i : arr) {
            bw.write(i + "\n");
        }
        bw.flush();
    }
}
