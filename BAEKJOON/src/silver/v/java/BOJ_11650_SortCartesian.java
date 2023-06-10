package silver.v.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 좌표 정렬하기
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BOJ_11650_SortCartesian {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(br.readLine());
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        br.close();
        Arrays.sort(points, Comparator.comparingInt((Point pt) -> pt.x).thenComparingInt(pt -> pt.y));
        StringBuilder ans = new StringBuilder();
        for (Point point : points) {
            ans.append(point.x).append(" ").append(point.y).append("\n");
        }
        System.out.print(ans);
    }
}
