package kr.co.programmers.lv0;

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

    public static void main(String[] args) {

        Day6 day6 = new Day6();

        System.out.println(day6.reverseStr("jaron"));
        System.out.println(day6.reverseStr("bread"));

        System.out.println("=================================================");

        day6.printRightTriangle();
    }
}
