package kr.co.programmers.lv0;

// 문자열, 조건문, 수학, 반복문
public class Day7 {

    // 특정 문자 제거하기
    private String removeChar(String my_string, String letter) {

        /*
        StringBuilder answer = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (!String.valueOf(c).equals(letter)) {
                answer.append(c);
            }
        }
        return answer.toString();
        */

        String answer = "";
        answer = my_string.replace(letter, "");
        return answer;
    }

    public static void main(String[] args) {

        Day7 day7 = new Day7();

        System.out.println(day7.removeChar("abcdef", "f"));
        System.out.println(day7.removeChar("BCBdbe", "B"));

        System.out.println("=================================================");
    }
}
