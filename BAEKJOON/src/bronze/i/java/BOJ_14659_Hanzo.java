package bronze.i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한조서열정리하고옴ㅋㅋ
public class BOJ_14659_Hanzo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxHeight = Integer.parseInt(st.nextToken());
        int maxKill = 0;
        int kill = 0;
        for (int i = 1; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (maxHeight > temp) {
                kill++;
            } else {
                maxHeight = temp;
                maxKill = Math.max(maxKill, kill);
                kill = 0;
            }
        }
        System.out.print(Math.max(maxKill, kill));
    }
}
