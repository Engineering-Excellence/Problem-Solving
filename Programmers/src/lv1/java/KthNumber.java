package lv1.java;

import java.util.Arrays;
import java.util.stream.IntStream;

// K번째 수
public class KthNumber {

    private int[] solution(int[] array, int[][] commands) {

        return IntStream.range(0, 3).map(i -> Arrays.stream(Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1])).sorted().toArray()[commands[i][2] - 1]).toArray();
    }

    public static void main(String[] args) {

        KthNumber kthNumber = new KthNumber();

        System.out.println(Arrays.toString(kthNumber.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}
