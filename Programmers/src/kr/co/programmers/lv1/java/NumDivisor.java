package kr.co.programmers.lv1.java;

// 약수의 개수와 덧셈
public class NumDivisor {

    private int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            answer = numDivisor(i) % 2 == 0 ? answer + i : answer - i;
        }
        return answer;
    }

    private int numDivisor(int n) {
        int cnt = 2;
        for (int i = 2; i <= n / 2; i ++) {
            if (n % i == 0) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {

        NumDivisor numDivisor = new NumDivisor();

        System.out.println(numDivisor.solution(13, 17));
        System.out.println(numDivisor.solution(24, 27));
    }
}
