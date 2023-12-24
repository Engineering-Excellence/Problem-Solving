package lv0.training.java;

/**
 * <h1>Day16 클래스</h1>
 * Programmers 코딩 기초 트레이닝 - Day 16 문자열
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

    public static void main(String[] args) {
        Day16 day16 = new Day16();

        System.out.println(day16.solution1("aBcDeFg"));
        System.out.println(day16.solution1("AAA"));
    }
}
