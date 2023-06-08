package gold.v.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 주사위
public class BOJ_1041_Dice {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final long N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dice = new int[6];
        for (int i = 0; i < 6; i++) {
            dice[i] = Integer.parseInt(st.nextToken());
        }
        if (N == 1) {
            Arrays.sort(dice);
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += dice[i];
            }
            System.out.print(sum);
        } else {
            long[] side = new long[3];
            for (int i = 0; i < 3; i++) {
                side[i] = Math.min(dice[i], dice[5 - i]);
            }
            Arrays.sort(side);
            System.out.print((5 * N * N - 8 * N + 4) * side[0] + (8 * N - 8) * side[1] + 4 * side[2]);
        }
    }
}
