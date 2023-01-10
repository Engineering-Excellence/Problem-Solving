package kr.co.programmers.lv0;

import java.util.*;

// 사칙연산, 배열, 수학
public class Mathematics {

    // 나머지 구하기
    private int mod(int num1, int num2) {

        return num1 % num2;
    }

    // 중앙값 구하기
    private int median(int[] array) {

        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.: ");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.: ");
        int num2 = scanner.nextInt();
        scanner.close();

        Mathematics mathematics = new Mathematics();
        System.out.printf("%d %% %d = %d%n", num1, num2, mathematics.mod(num1, num2));
        System.out.println(mathematics.median(new int[]{9, -1, 0}));
    }
}
