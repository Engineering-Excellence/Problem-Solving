package bronze.v;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 두 수 비교하기
public class BOJ_1330_CompareNum {

    static String compare(int A, int B) {
        if (A > B) return ">";
        else if (A < B) return "<";
        else return "==";
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(compare(A, B));
    }
}
