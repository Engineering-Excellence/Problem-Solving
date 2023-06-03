package gold.v.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Fly me to the Alpha Centauri
public class BOJ_1011_FlyMeToTheAlphaCentauri {

    public static void main(String[] args) throws IOException {

//        System.setIn(new FileInputStream("BAEKJOON/sample_input.txt"));
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 0; test_case < T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int distance = y - x;
            int cnt;
            int max = (int) Math.sqrt(distance);
            if (distance == max * max) cnt = 2 * max - 1;
            else if (distance > max * max && distance <= max * max + max) cnt = 2 * max;
            else cnt = 2 * max + 1;
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}
