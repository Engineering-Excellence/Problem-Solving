package lv0.basic.java;

import java.util.Arrays;

/**
 * <h1>Day25 이차원 리스트(배열)</h1>
 * Programmers 코딩 기초 트레이닝
 *
 * @author Kyle
 * @since 2024.04.06.
 */
public class Day25 {

    /**
     * solution 정수를 나선형으로 배치하기
     *
     * @param n 양의 정수
     * @return n × n 배열에 1부터 n^2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열
     */
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0, y = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int direction = 0;

        while (num <= n * n) {
            answer[x][y] = num++;

            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                direction = (direction + 1) % 4; //범위 밖에 나갔을 때 방향전환
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }

        return answer;
    }

    public static void main(String[] args) {
        Day25 day25 = new Day25();

        System.out.println(Arrays.deepToString(day25.solution(4)));
        System.out.println(Arrays.deepToString(day25.solution(5)));
    }
}
