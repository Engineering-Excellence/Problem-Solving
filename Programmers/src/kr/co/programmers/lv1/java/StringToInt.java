package kr.co.programmers.lv1.java;

// 문자열을 정수로 바꾸기

public class StringToInt {

    private int solution(String s) {

        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        StringToInt stringToInt = new StringToInt();

        System.out.println(stringToInt.solution("-1234"));
    }
}
