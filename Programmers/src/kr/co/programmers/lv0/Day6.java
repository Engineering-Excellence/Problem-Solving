package kr.co.programmers.lv0;

import java.util.Arrays;
import java.util.Scanner;

// 문자열, 반복문, 출력, 배열, 조건문
public class Day6 {

    // 문자열 뒤집기
    private String reverseStr(String my_string) {

        StringBuilder stringBuilder = new StringBuilder(my_string);
        return stringBuilder.reverse().toString();
    }

    // 직각삼각형 출력하기
    private void printRightTriangle() {

        System.out.print("직각삼각형의 크기: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }

    // 짝수 홀수 개수
    private int[] evenOdd(int[] num_list) {

        /*
        int even = 0;
        for (int n : num_list) {
            if (n % 2 == 0) {
                even++;
            }
        }
        return new int[]{even, num_list.length - even};
        */

        int[] answer = new int[2];
        for (int n : num_list) {
            answer[n % 2]++;
        }
        return answer;
    }

    // 문자 반복 출력하기
    private String repeatStr(String my_string, int n) {

        StringBuilder answer = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            answer.append(String.valueOf(c).repeat(n));
        }
        return answer.toString();

        /*
            toCharArray(): String 타입을 char[] 타입으로 변경
            ※ char[] 타입을 String()을 사용하여 String 타입으로 변경 가능
         */
    }

    public static void main(String[] args) {

        Day6 day6 = new Day6();

        System.out.println(day6.reverseStr("jaron"));
        System.out.println(day6.reverseStr("bread"));

        System.out.println("=================================================");

        day6.printRightTriangle();

        System.out.println("=================================================");

        System.out.println(Arrays.toString(day6.evenOdd(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(day6.evenOdd(new int[]{1, 3, 5, 7})));

        System.out.println("=================================================");

        System.out.println(day6.repeatStr("hello", 3));
    }
}
