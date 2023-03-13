package kr.co.programmers.lv0;

// 문자열, 반복문, 출력, 배열, 조건문
public class Day6 {

    // 문자열 뒤집기
    private String reverseStr(String my_string) {

        StringBuilder stringBuilder = new StringBuilder(my_string);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {

        Day6 day6 = new Day6();

        System.out.println(day6.reverseStr("jaron"));
        System.out.println(day6.reverseStr("bread"));

        System.out.println("=================================================");
    }
}
