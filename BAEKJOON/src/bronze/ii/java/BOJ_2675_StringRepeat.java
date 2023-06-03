package bronze.ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문자열 반복
public class BOJ_2675_StringRepeat {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();
        final int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int rpt = Integer.parseInt(st.nextToken());
            st.nextToken().chars().forEach(c -> ans.append(Character.toString((char) c).repeat(rpt)));
            ans.append("\n");
        }
        System.out.print(ans);
    }
}
