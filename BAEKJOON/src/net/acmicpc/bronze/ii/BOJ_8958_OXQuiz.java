package net.acmicpc.bronze.ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// OX퀴즈
public class BOJ_8958_OXQuiz {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int sum = 0;
            int pt = 0;
            for (char c : br.readLine().toCharArray()) {
                if ((c == 'O')) {
                    sum += ++pt;
                } else {
                    pt = 0;
                }
            }
            ans.append(sum).append("\n");
        }
        System.out.print(ans);
    }
}
