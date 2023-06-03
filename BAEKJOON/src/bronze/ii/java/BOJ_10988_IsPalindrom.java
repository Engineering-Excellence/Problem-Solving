package bronze.ii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린드롬인지 확인하기
public class BOJ_10988_IsPalindrom {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        System.out.print(sb.toString().contentEquals(sb.reverse()) ? 1 : 0);
    }
}
