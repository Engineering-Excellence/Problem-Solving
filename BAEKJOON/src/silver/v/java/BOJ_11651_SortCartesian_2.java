package silver.v.java;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 좌표 정렬하기 2
public class BOJ_11651_SortCartesian_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        StringBuilder ans = new StringBuilder();
        Arrays.stream(points).sorted(Comparator.comparingInt((Point pt) -> pt.y).thenComparingInt(pt -> pt.x))
                .forEach((Point pt) -> ans.append(pt.x).append(" ").append(pt.y).append("\n"));
        System.out.print(ans);
    }
}
