/**
 * <h1>Day 22 함수(메서드), 조건문 활용</h1>
 * Programmers 코딩 기초 트레이닝
 *
 * @author Kyle
 * @since 2024.01.07.
 */
#include <stdio.h>
#include <stdlib.h>

/**
 * 문자열로 변환
 *
 * @param n 정수
 * @return n을 문자열로 변환하여 반환
 */
char *solution(int n) {
    char *answer = (char *) malloc(6 * sizeof(char));
    sprintf(answer, "%d", n);
    return answer;
}

int main(void) {
    puts(solution(123));
    puts(solution(2573));

    return 0;
}
