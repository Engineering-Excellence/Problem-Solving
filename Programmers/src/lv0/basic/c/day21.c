/**
 * <h1>Day 21 함수(메서드)</h1>
 * Programmers 코딩 기초 트레이닝
 *
 * @author Kyle
 * @since 2024.01.06.
 */
#include <stdio.h>

/**
 * solution 정수 부분
 * @param flo 실수
 * @return flo의 정수 부분
 */
int solution(double flo) {
    return (int) flo;
}

int main(void) {
    printf("%d\n", solution(1.42));
    printf("%d\n", solution(69.32));

    return 0;
}
