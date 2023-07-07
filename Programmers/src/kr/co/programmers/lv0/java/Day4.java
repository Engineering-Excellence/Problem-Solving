package kr.co.programmers.lv0.java;

// 수학, 배열
public class Day4 {

    // 피자 나눠 먹기 (1)
    private void pizza1(int n) {

        int answer = n % 7 == 0 ? n / 7 : n / 7 + 1;
        System.out.printf("%d명이 피자를 최소 한 조각씩 먹기 위해서 최소 %d판이 필요합니다.%n", n, answer);
    }

    // 피자 나눠 먹기 (2)
    private void pizza2(int n) {

        int lcm = getLCM(Math.max(n, 6), Math.min(n, 6));
        int answer = lcm / 6;
        if (n != 0)
            System.out.printf("%d명이 모두 같은 양을 먹기 위해 최소 %d판을 시켜야 피자가 %d조각으로 모두 %d조각씩 먹을 수 있습니다.%n", n, answer, 6 * answer, 6 * answer / n);
    }

    // 최대공약수
    private int getGCD(int a, int b) {

        if (b == 0) return a;
        return getGCD(b, a % b);
    }

    // 최소공배수
    private int getLCM(int a, int b) {

        return a * b / getGCD(a, b);
    }

    // 피자 나눠 먹기 (3)
    private void pizza3(int slice, int n) {

        System.out.printf("%d명이 %d조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 %d판을 시켜야 합니다.%n", n, slice, n % slice == 0 ? n / slice : n / slice + 1);
    }

    // 배열의 평균값
    private void avgArr(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum / numbers.length);
    }

    public static void main(String[] args) {

        Day4 day4 = new Day4();

        day4.pizza1(7);
        day4.pizza1(1);
        day4.pizza1(15);

        System.out.println("================================================================================================");

        day4.pizza2(6);
        day4.pizza2(10);
        day4.pizza2(4);

        System.out.println("================================================================================================");

        day4.pizza3(7, 10);
        day4.pizza3(4, 12);

        System.out.println("================================================================================================");

        day4.avgArr(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        day4.avgArr(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});
    }
}
