package kr.co.programmers.lv1;

public class SumDivisor {

    private int solution(int n) {

        int sum = n;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        SumDivisor sumDivisor = new SumDivisor();

        System.out.println(sumDivisor.solution(12));
        System.out.println(sumDivisor.solution(5));
    }
}
