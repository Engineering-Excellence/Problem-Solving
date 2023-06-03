package bronze.v;

import java.io.*;

// 구구단
public class BOJ_2739_TimesTable {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int N = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 1; i < 10; i++) {
            bw.write(N + " * " + i + " = " + N * i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
