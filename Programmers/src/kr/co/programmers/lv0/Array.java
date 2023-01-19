package kr.co.programmers.lv0;

// 수학, 배열
public class Array {

    // 피자 나눠 먹기 (1)
    private void pizza1(int n) {

        int answer = n % 7 == 0 ? n / 7 : n / 7 + 1;
        System.out.printf("%d명이 피자를 최소 한 조각씩 먹기 위해서 최소 %d판이 필요합니다.%n", n, answer);
    }

    // 피자 나눠 먹기 (2)
    private void pizza2(int n) {

        int lcm = getLCM(Math.max(n, 6), Math.min(n, 6));
        int answer = lcm / 6;
        if (n != 0) System.out.printf("%d명이 모두 같은 양을 먹기 위해 최소 %d판을 시켜야 피자가 %d조각으로 모두 %d조각씩 먹을 수 있습니다.%n", n, answer, 6 * answer, 6 * answer / n);
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

    public static void main(String[] args) {

        Array array = new Array();

        array.pizza1(7);
        array.pizza1(1);
        array.pizza1(15);

        System.out.println("================================================================================================");

        array.pizza2(6);
        array.pizza2(10);
        array.pizza2(4);
    }
}
