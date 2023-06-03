package bronze.ii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 음계
public class BOJ_2920_MusicalScale {

    private static boolean compare(int[] scales, int[] asc) {

        for (int i = 0; i < 8; i++) {
            if (scales[i] != asc[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int[] scales = new int[8];
        for (int i = 0; i < 8; i++) {
            scales[i] = Integer.parseInt(st.nextToken());
        }
        int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] desc = {8, 7, 6, 5, 4, 3, 2, 1};
        if (compare(scales, asc)) {
            System.out.print("ascending");
        } else if (compare(scales, desc)) {
            System.out.print("descending");
        } else {
            System.out.print("mixed");
        }
    }
}
