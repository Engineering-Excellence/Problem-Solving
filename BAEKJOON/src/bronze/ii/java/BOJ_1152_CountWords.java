package bronze.ii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 단어의 개수
public class BOJ_1152_CountWords {

    public static void main(String[] args) throws IOException {

        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine()).countTokens());
    }
}
