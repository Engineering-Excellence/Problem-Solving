package kr.co.programmers.lv0;

// 문자열, 정렬, 사칙연산, 수학
public class Day12 {

    // 모음 제거
    private String removeVowel(String my_string) {

        return my_string.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {

        Day12 day12 = new Day12();

        System.out.println(day12.removeVowel("bus"));
        System.out.println(day12.removeVowel("nice to meet you"));
    }
}
