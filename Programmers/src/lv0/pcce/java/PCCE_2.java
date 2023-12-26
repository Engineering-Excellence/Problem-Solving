package lv0.pcce.java;

import java.util.Scanner;

/**
 * <h1>[PCCE 기출문제] 2번 / 피타고라스의 정리</h1>
 * 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때, 다른 한 변의 길이의 제곱, b_square 을 출력
 *
 * @author Kyle
 * @since 2023.12.26.
 */
public class PCCE_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (c + a) * (c - a);

        System.out.println(b_square);
    }
}
