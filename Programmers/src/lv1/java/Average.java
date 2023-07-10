package lv1.java;

import java.util.Arrays;

// 평균 구하기
public class Average {

    private double solution(int[] arr) {

        return Arrays.stream(arr).average().getAsDouble();
    }

    public static void main(String[] args) {

        Average average = new Average();
        System.out.println(average.solution(new int[]{1, 2, 3, 4}));
        System.out.println(average.solution(new int[]{5, 5}));
    }
}
