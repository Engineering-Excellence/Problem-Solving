package kr.co.programmers.lv1;

/*
    수박수박수박수박수박수?
    길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 */
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
