package lv1.java;

// 약수의 합
// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
public class SumDivisor {

    public int solution(int n) {

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
