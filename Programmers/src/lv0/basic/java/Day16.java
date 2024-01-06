package lv0.basic.java;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>Day 16 문자열</h1>
 * Programmers 코딩 기초 트레이닝
 *
 * @author Kyle
 * @since 2023.12.24
 */
public class Day16 {

    /**
     * solution1 대문자로 바꾸기
     *
     * @param myString 알파벳으로 이루어진 문자열
     * @return myString을 대문자로 변환하여 반환
     */
    private String solution1(String myString) {
        return myString.toUpperCase();
    }

    /**
     * solution2 소문자로 바꾸기
     *
     * @param myString 알파벳으로 이루어진 문자열
     * @return myString을 소문자로 변환하여 반환
     */
    private String solution2(String myString) {
        return myString.toLowerCase();
    }

    /**
     * solution3 배열에서 문자열 대소문자 변환하기
     *
     * @param strArr 모든 원소가 알파벳으로만 이루어진 문자열 배열
     * @return strArr의 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환
     */
    private String[] solution3(String[] strArr) {
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new);
    }

    /**
     * solution4 A 강조하기
     *
     * @param myString 알파벳으로 이루어진 문자열
     * @return 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 반환
     */
    private String solution4(String myString) {
        return myString.toLowerCase().replace("a", "A");
    }

    /**
     * solution5 특정한 문자를 대문자로 바꾸기
     *
     * @param my_string 영소문자로 이루어진 문자열
     * @param alp       영소문자 1글자로 이루어진 문자열
     * @return my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열
     */
    private String solution5(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }

    public static void main(String[] args) {
        Day16 day16 = new Day16();

        System.out.println(day16.solution1("aBcDeFg"));
        System.out.println(day16.solution1("AAA"));

        System.out.println(day16.solution2("aBcDeFg"));
        System.out.println(day16.solution2("aaa"));

        System.out.println(Arrays.toString(day16.solution3(new String[]{"AAA", "BBB", "CCC", "DDD"})));
        System.out.println(Arrays.toString(day16.solution3(new String[]{"aBc", "AbC"})));

        System.out.println(day16.solution4("abstract algebra"));
        System.out.println(day16.solution4("PrOgRaMmErS"));

        System.out.println(day16.solution5("programmers", "p"));
        System.out.println(day16.solution5("lowercase", "x"));
    }
}
