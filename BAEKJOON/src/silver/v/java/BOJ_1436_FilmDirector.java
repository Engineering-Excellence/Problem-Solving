package silver.v.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 영화감독 숌
public class BOJ_1436_FilmDirector {

    public static void main(String[] args) throws IOException {

        final int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int cnt = 1;
        int num = 666;
        while (cnt < N) {
            num++;
            if (String.valueOf(num).contains("666")) cnt++;
        }
        System.out.print(num);
    }
}
