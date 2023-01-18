package kr.co.programmers.lv0;

// 수학, 배열
public class Array {

    // 피자 나눠 먹기 (1)
    private void pizza1(int n) {

        int answer = n % 7 == 0 ? n / 7 : n / 7 + 1;
        System.out.printf("%d명이 피자를 최소 한 조각씩 먹기 위해서 최소 %d판이 필요합니다.%n", n, answer);
    }

    public static void main(String[] args) {

        Array array = new Array();

        array.pizza1(7);
        array.pizza1(1);
        array.pizza1(15);
    }
}
