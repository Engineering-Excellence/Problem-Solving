package lv0.introduction.java;

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

    // 각도기
    private int protractor(int angle) {

        /*
            int answer;
            if (angle > 0 && angle < 90) answer = 1;
            else if (angle == 90) answer = 2;
            else if (angle > 90 && angle < 180) answer = 3;
            else answer = 4;
            return answer;
        */

        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
    }

    // 양꼬치
    private int bill(int n, int k) {

        return 12000 * n + 2000 * k - (n / 10) * 2000;
    }

    // 짝수의 합
    private int sumEven(int n) {

        return n / 2 * (n + 2) / 2;
    }

    public static void main(String[] args) {

        Day7 day7 = new Day7();

        System.out.println(day7.removeChar("abcdef", "f"));
        System.out.println(day7.removeChar("BCBdbe", "B"));

        System.out.println("=================================================");

        System.out.printf("%,d%n", day7.bill(10, 3));
        System.out.printf("%,d%n", day7.bill(64, 6));

        System.out.println("=================================================");

        System.out.println(day7.sumEven(10));
        System.out.println(day7.sumEven(4));

        System.out.println("=================================================");

        System.out.println(day7.protractor(70));
        System.out.println(day7.protractor(91));
        System.out.println(day7.protractor(180));
    }
}
