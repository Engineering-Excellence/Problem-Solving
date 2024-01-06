/**
 * <h1>Day 8 조건문, 문자열</h1>
 * Programmers 코딩 기초 트레이닝
 *
 * @author Kyle
 * @since 2023.11.27.
 */
#include <stdio.h>
#include <stdbool.h>

/**
 * solution 간단한 논리 연산
 *
 * @param x1 boolean 변수
 * @param x2 boolean 변수
 * @param x3 boolean 변수
 * @param x4 boolean 변수
 * @return (x1 ∨ x2) ∧ (x3 ∨ x4)의 true/false를 반환
 */
bool solution(bool x1, bool x2, bool x3, bool x4) {
    return (x1 || x2) & (x3 || x4);
}

int main(void) {
    printf("%d\n", solution(0, 1, 1, 1));
    printf("%d\n", solution(1, 0, 0, 0));
    return 0;
}
