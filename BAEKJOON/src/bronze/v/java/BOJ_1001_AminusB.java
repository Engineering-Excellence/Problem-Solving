package bronze.v.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A-B
public class BOJ_1001_AminusB {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.print(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
    }
}
