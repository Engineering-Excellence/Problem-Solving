package silver.iv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 붙임성 좋은 총총이
public class BOJ_26069_ChongChong {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        Set<String> dancers = new HashSet<>();
        dancers.add("ChongChong");
        for (int i = 0; i < N; i++) {
            String[] people = br.readLine().split(" ");
            for (String person : people) {
                if (dancers.contains(person)) {
                    dancers.addAll(Arrays.asList(people));
                    break;
                }
            }
        }
        br.close();
        System.out.print(dancers.size());
    }
}
