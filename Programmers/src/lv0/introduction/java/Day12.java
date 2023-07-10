package lv0.introduction.java;

import java.util.Arrays;

// 문자열, 정렬, 사칙연산, 수학
public class Day12 {

    // 모음 제거
    private String removeVowel(String my_string) {

        return my_string.replaceAll("[aeiou]", "");
    }

    // 문자열 정렬하기 (1)
    private int[] stringSort(String my_string) {

//        return my_string.chars().filter(c -> c >= '0' && c <= '9').map(c -> c - '0').sorted().toArray();
        return Arrays.stream(my_string.replaceAll("\\D", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {

        Day12 day12 = new Day12();

        System.out.println(day12.removeVowel("bus"));
        System.out.println(day12.removeVowel("nice to meet you"));

        System.out.println("-".repeat(40));

        System.out.println(Arrays.toString(day12.stringSort("hi12392")));
        System.out.println(Arrays.toString(day12.stringSort("p2o4i8gj2")));
        System.out.println(Arrays.toString(day12.stringSort("abcde0")));
    }
}
