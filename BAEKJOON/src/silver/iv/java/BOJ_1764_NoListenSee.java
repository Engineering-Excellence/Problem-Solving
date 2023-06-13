package silver.iv.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 듣보잡
public class BOJ_1764_NoListenSee {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int N = Integer.parseInt(st.nextToken());
        final int M = Integer.parseInt(st.nextToken());
        Set<String> noListen = new HashSet<>(N);
        Set<String> noListenSee = new HashSet<>(M);
        for (int i = 0; i < N; i++) {
            noListen.add(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            String noSee = br.readLine();
            if (noListen.contains(noSee))
                noListenSee.add(noSee);
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(noListenSee.size()).append("\n");
        noListenSee.stream().sorted().forEach(s -> sb.append(s).append("\n"));
        System.out.print(sb);
    }
}
