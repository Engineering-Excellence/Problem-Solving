package lv0.introduction.java;

import java.util.Arrays;

/**
 * <h1>Day12 문자열, 정렬, 사칙연산, 수학</h1>
 *
 * @author Kyle
 * @since 2023.05.28.
 */
public class Day12 {

    /**
     * removeVowel 모음 제거
     *
     * @param my_string 문자열
     * @return 모음을 제거한 문자열
     */
    private String removeVowel(String my_string) {

        return my_string.replaceAll("[aeiou]", "");
    }

    /**
     * stringSort 문자열 정렬하기 (1)
     *
     * @param my_string 문자열
     * @return my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트
     */
    private int[] stringSort(String my_string) {

//        return my_string.chars().filter(c -> c >= '0' && c <= '9').map(c -> c - '0').sorted().toArray();
        return Arrays.stream(my_string.replaceAll("\\D", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }

    /**
     * hiddenSum 숨어있는 숫자의 덧셈 (1)
     *
     * @param my_string 문자열
     * @return my_string안의 모든 자연수들의 합
     */
    private int hiddenSum(String my_string) {
        return my_string.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
    }

    public static void main(String[] args) {

        Day12 day12 = new Day12();

        System.out.println(day12.removeVowel("bus"));
        System.out.println(day12.removeVowel("nice to meet you"));

        System.out.println("-".repeat(40));

        System.out.println(Arrays.toString(day12.stringSort("hi12392")));
        System.out.println(Arrays.toString(day12.stringSort("p2o4i8gj2")));
        System.out.println(Arrays.toString(day12.stringSort("abcde0")));

        System.out.println("-".repeat(40));

        System.out.println(day12.hiddenSum("aAb1B2cC34oOp"));
        System.out.println(day12.hiddenSum("1a2b3c4d123"));
    }
}
