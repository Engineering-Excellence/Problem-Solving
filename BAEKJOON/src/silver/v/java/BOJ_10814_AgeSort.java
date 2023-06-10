package silver.v.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

// 나이순 정렬
class User {
    int age;
    String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class BOJ_10814_AgeSort {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        List<User> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new User(Integer.parseInt(st.nextToken()), st.nextToken()));
        }
        br.close();
        list.sort(Comparator.comparingInt(o -> o.age));
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {
            ans.append(list.get(i).age).append(" ").append(list.get(i).name).append("\n");
        }
        System.out.print(ans);
    }
}
