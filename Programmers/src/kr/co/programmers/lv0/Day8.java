package kr.co.programmers.lv0;

import java.util.Arrays;

// 배열, 구현, 수학
public class Day8 {

    // 진료순서 정하기
    public int[] emergencyCare(int[] emergency) {

        int[] answers = new int[emergency.length];

        /*Arrays.fill(answer, 1);
        for (int i : emergency) {
            for (int j = 0; j < emergency.length; j++) {
                if (i > emergency[j]) {
                    answer[j]++;
                }
            }
        }*/

        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < emergency.length; i++) {
            int answer = Arrays.binarySearch(sorted, emergency[i]);
            answers[i] = sorted.length - answer;
        }

        return answers;
    }

    public static void main(String[] args) {

        Day8 day8 = new Day8();

        System.out.println(Arrays.toString(day8.emergencyCare(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(day8.emergencyCare(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(day8.emergencyCare(new int[]{30, 10, 23, 6, 100})));
    }
}
