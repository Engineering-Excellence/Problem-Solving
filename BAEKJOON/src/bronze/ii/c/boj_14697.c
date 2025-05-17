/**
 * @file boj_14697.c
 * @brief 방 배정하기
 *
 * @author Kyle
 * @date 2025-05-18
 */

#include <stdio.h>

/**
 * @brief 빈 침대 없이 방 배정이 가능할 경우 '1'을, 불가능할 경우 '0'을 반환한다.
 *
 * @param a 방의 정원을 나타내는 서로 다른 세 자연수
 * @param b 방의 정원을 나타내는 서로 다른 세 자연수
 * @param c 방의 정원을 나타내는 서로 다른 세 자연수
 * @param n 전체 학생 수를 나타내는 자연수
 * @return char 방 배정 가능 여부
 */
char solution(int a, int b, int c, int n) {
    for (int i = 0; a * i <= n; ++i) {
        for (int j = 0; a * i + b * j <= n; ++j) {
            for (int k = 0; a * i + b * j + c * k <= n; ++k) {
                if (a * i + b * j + c * k == n) {
                    return '1';
                }
            }
        }
    }
    return '0';
}

int main() {
    int a, b, c, n;
    scanf("%d %d %d %d", &a, &b, &c, &n);

    putchar(solution(a, b, c, n));
    return 0;
}
