package net.acmicpc.bronze.V;

import java.io.*;

// 문자열
public class Prob_9086_String {

    public static void main(String[] args) throws IOException {

//        System.setIn(new FileInputStream("BAEKJOON/sample_input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        StringBuilder ans = new StringBuilder();

        for (int test_case = 1; test_case <= T; test_case++) {
            String str = br.readLine();
            ans.append(str.charAt(0)).append(str.length() > 1 ? str.charAt(str.length() - 1) : str.charAt(0)).append("\n");
        }
        bw.write(String.valueOf(ans));
        bw.close();
    }
}
