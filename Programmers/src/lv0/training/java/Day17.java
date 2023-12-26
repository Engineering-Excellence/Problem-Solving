package lv0.training.java;

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

    public static void main(String[] args) {
        Day17 day17 = new Day17();

        System.out.println(day17.solution1("AbCdEFG", "dE"));
        System.out.println(day17.solution1("AAAAaaaa", "a"));

        System.out.println(day17.solution2("banana", "ana"));
        System.out.println(day17.solution2("aaaa", "aa"));
    }
}
