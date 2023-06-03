package bronze.iii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최댓값
public class BOJ_2562_Max {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int idx = -1, max = -1, temp;
        for (int i = 1; i <= 9; i++) {
            temp = Integer.parseInt(br.readLine());
            if (temp > max) {
                max = temp;
                idx = i;
            }
        }
        System.out.print(sb.append(max).append("\n").append(idx));
    }
}
