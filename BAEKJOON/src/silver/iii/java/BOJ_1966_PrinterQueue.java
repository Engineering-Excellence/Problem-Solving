package silver.iii.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 프린터 큐
public class BOJ_1966_PrinterQueue {

    public static void main(String[] args) throws IOException {

        StringBuilder ans = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Deque<List<Integer>> queue = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                queue.add(Arrays.asList(j, Integer.parseInt(st.nextToken())));
            }
            int cnt = 0;
            while (!queue.isEmpty()) {
                List<Integer> list = queue.poll();
                boolean flag = true;
                for (List<Integer> otherList : queue) {
                    if (otherList.get(1) > list.get(1)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    cnt++;
                    if (list.get(0) == m) {
                        ans.append(cnt).append("\n");
                        break;
                    }
                } else {
                    queue.offer(list);
                }
            }
        }
        System.out.print(ans);
    }
}