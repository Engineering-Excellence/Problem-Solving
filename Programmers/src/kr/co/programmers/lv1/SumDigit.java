package kr.co.programmers.lv1;

public class SumDigit {

    private int solution(int n) {

        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {

        SumDigit sumDigit = new SumDigit();
        System.out.println(sumDigit.solution(123));
        System.out.println(sumDigit.solution(987));
    }
}
