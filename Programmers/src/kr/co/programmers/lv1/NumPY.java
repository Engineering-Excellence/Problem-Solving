package kr.co.programmers.lv1;

// 문자열 내 p와 y의 개수
public class NumPY {

    boolean solution(String s) {

        return s.replaceAll("[Pp]", "").length() == s.replaceAll("[Yy]", "").length();
    }

    public static void main(String[] args) {

        NumPY numPY = new NumPY();

        System.out.println(numPY.solution("pPoooyY"));
        System.out.println(numPY.solution("Pyy"));
    }
}
