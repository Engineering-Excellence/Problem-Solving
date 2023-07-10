package lv0.introduction.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 사칙연산, 조건문, 배열
class Day2 {

    // 두 수의 나눗셈
    private int divide(int num1, int num2) {

        return (int) ((float) num1 / num2 * 1000);
    }

    // 숫자 비교하기
    private int isEqual(int num1, int num2) {

        return num1 == num2 ? 1 : -1;
    }

    // 분수의 덧셈
    private int[] sumFraction(int numer1, int denom1, int numer2, int denom2) {

        int numerator = numer1 * denom2 + denom1 * numer2;
        int denominator = denom1 * denom2;
        int gcd = getGCD(Math.max(numerator, denominator), Math.min(numerator, denominator));

        return new int[]{numerator / gcd, denominator / gcd};
    }

    // 최대공약수(유클리드 호제법)
    public int getGCD(int a, int b) {

        if (b == 0) return a;
        return getGCD(b, a % b);
    }

    // 배열 두 배 만들기
    private int[] getDoubledArray(int[] numbers) {

        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = 2 * numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.: ");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.: ");
        int num2 = scanner.nextInt();
        scanner.close();
        Random random = new Random();
        int denum1 = random.nextInt(1, 1000);
        int denum2 = random.nextInt(1, 1000);

        Day2 obj = new Day2();
        System.out.printf("[%d / %d * 1000] = %d%n", num1, num2, obj.divide(num1, num2));
        System.out.printf("%d %s %d%n", num1, obj.isEqual(num1, num2) == 1 ? "==" : "!=", num2);
        System.out.printf("%d/%d + %d/%d = %d/%d%n", denum1, num1, denum2, num2, obj.sumFraction(denum1, num1, denum2, num2)[0], obj.sumFraction(denum1, num1, denum2, num2)[1]);
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        System.out.printf("%s * 2 = %s", Arrays.toString(numbers), Arrays.toString(obj.getDoubledArray(numbers)));
    }
}
