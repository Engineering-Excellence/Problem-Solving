package kr.co.programmers.lv0;

import java.util.Scanner;

// 사칙연산
class Day01 {

    // 두 수의 합
    int add(int num1, int num2) {

        return num1 + num2;
    }

    // 두 수의 차
    int subtract(int num1, int num2) {

        return num1 - num2;
    }

    // 두 수의 곱
    int multiply(int num1, int num2) {

        return num1 * num2;
    }

    // 몫 구하기
    int divide(int num1, int num2) {

        return num1 / num2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.: ");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.: ");
        int num2 = scanner.nextInt();
        scanner.close();

        Day01 obj = new Day01();
        System.out.printf("%d + %d = %d%n", num1, num2, obj.add(num1, num2));
        System.out.printf("%d - %d = %d%n", num1, num2, obj.subtract(num1, num2));
        System.out.printf("%d × %d = %d%n", num1, num2, obj.multiply(num1, num2));
        System.out.printf("%d ÷ %d = %d%n", num1, num2, obj.divide(num1, num2));
    }
}

