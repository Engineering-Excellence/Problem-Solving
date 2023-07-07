package kr.co.programmers.introduction.java;

import java.util.Arrays;
import java.util.stream.Collectors;

// 배열, 구현, 수학
public class Day8 {

    // 배열 자르기
    private int[] sliceArray(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    // 외계행성의 나이
    private String age(int age) {

        /*
            StringBuilder ans = new StringBuilder();
            String.valueOf(age).chars().forEach(c -> ans.append((char) (c + 49)));
            return ans.toString();
        */

        return String.valueOf(age).chars().mapToObj(c -> String.valueOf((char) (c + 49))).collect(Collectors.joining());
    }

    // 진료순서 정하기
    private int[] emergencyCare(int[] emergency) {

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

        System.out.println("=".repeat(60));

        System.out.println(Arrays.toString(day8.sliceArray(new int[]{1, 2, 3, 4, 5}, 1, 3)));
        System.out.println(Arrays.toString(day8.sliceArray(new int[]{1, 3, 5}, 1, 2)));

        System.out.println("=".repeat(60));

        System.out.println(day8.age(23));
        System.out.println(day8.age(51));
        System.out.println(day8.age(100));
    }
}
