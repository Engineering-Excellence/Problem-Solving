package kr.co.programmers.lv1;

public class Watermelon {

    private String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append(i % 2 == 0 ? "수" : "박");
        }
        return answer.toString();
    }

    public static void main(String[] args) {

        Watermelon watermelon = new Watermelon();

        System.out.println(watermelon.solution(3));
        System.out.println(watermelon.solution(4));
    }
}
