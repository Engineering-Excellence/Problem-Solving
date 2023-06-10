package silver.v.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 정렬하기 2
public class BOJ_2751_SortNumbers_2 {

    public static void main(String[] args) throws IOException {

        final int OFFSET = 1000000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N + 1 + 2 * OFFSET];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int num;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            nums[num + OFFSET]++;
            max = Math.max(max, num + OFFSET);
            min = Math.min(min, num + OFFSET);
        }
        StringBuilder ans = new StringBuilder();
        for (int i = min; i <= max; i++) {
            if (nums[i] > 0) {
                ans.append(i - OFFSET).append("\n");
            }
        }
        System.out.print(ans);
    }
}
