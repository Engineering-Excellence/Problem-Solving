package lv0.training.java;

import java.util.Arrays;

/**
 * <h1>Day17 문자열</h1>
 * Programmers 코딩 기초 트레이닝
 *
 * @author Kyle
 * @since 2023.12.27.
 */
public class Day17 {

    /**
     * solution1 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
     *
     * @param myString 문자열
     * @param pat      문자열
     * @return myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 반환
     */
    private String solution1(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }

    /**
     * solution2 문자열이 몇 번 등장하는지 세기
     *
     * @param myString 문자열
     * @param pat      문자열
     * @return myString에서 pat이 등장하는 횟수를 반환
     */
    private int solution2(String myString, String pat) {
        int cnt = 0;
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (myString.startsWith(pat, i)) cnt++;
        }
        return cnt;
    }

    /**
     * solution3 ad 제거하기
     *
     * @param strArr 알파벳 소문자로 이루어진 문자열 배열
     * @return 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 반환
     */
    private String[] solution3(String[] strArr) {
        return Arrays.stream(strArr).filter(s -> !s.contains("ad")).toArray(String[]::new);
    }

    /**
     * solution4 공백으로 구분하기 1
     *
     * @param my_string 단어가 공백 한 개로 구분되어 있는 문자열
     * @return my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 반환
     */
    private String[] solution4(String my_string) {
        return my_string.split("\\s");
    }

    public static void main(String[] args) {
        Day17 day17 = new Day17();

        System.out.println(day17.solution1("AbCdEFG", "dE"));
        System.out.println(day17.solution1("AAAAaaaa", "a"));

        System.out.println(day17.solution2("banana", "ana"));
        System.out.println(day17.solution2("aaaa", "aa"));

        System.out.println(Arrays.toString(day17.solution3(new String[]{"and", "notad", "abcd"})));
        System.out.println(Arrays.toString(day17.solution3(new String[]{"there", "are", "no", "a", "ds"})));

        System.out.println(Arrays.toString(day17.solution4("i love you")));
        System.out.println(Arrays.toString(day17.solution4("programmers")));
    }
}
