package net.acmicpc.silver.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 회사에 있는 사람
public class Prob_7785_CompanyPeople {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (st.nextToken().equals("enter")) set.add(name);
            else set.remove(name);
        }
        List<String> list = new ArrayList<>(set);
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> ans.append(s).append("\n"));
        System.out.print(ans);
    }
}
