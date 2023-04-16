package kr.co.programmers.lv1;

import java.util.Arrays;

// 예산
public class Budget {

    private int solution(int[] d, int budget) {
        int answer = 0, sum = 0;
        Arrays.sort(d);
        for (int i : d) {
            if (sum + i > budget) break;
            answer++;
            sum += i;
        }
        return answer;
    }

    public static void main(String[] args) {

        Budget budget = new Budget();

        System.out.println(budget.solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println(budget.solution(new int[]{2, 2, 3, 3}, 10));
    }
}
