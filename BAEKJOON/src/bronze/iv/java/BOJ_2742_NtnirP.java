package bronze.iv.java;

import java.io.*;

// 기찍 N
public class BOJ_2742_NtnirP {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        final int N = Integer.parseInt(br.readLine());
        for (int i = N; i > 0; i--) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
