package bronze.v;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 윤년
public class BOJ_2753_LunarYear {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        br.close();
        System.out.print(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 1 : 0);
    }
}
