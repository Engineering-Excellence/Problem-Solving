/**
 * <h1>Day 21 함수(메서드)</h1>
 * Programmers 코딩 기초 트레이닝
 *
 * @author Kyle
 * @since 2024.01.06.
 */
#include <stdio.h>
#include <stdlib.h>

/**
 * solution3 정수 부분
 *
 * @param flo 실수
 * @return flo의 정수 부분
 */
int solution3(double flo) {
    return (int) flo;
}

/**
 * solution5 문자열을 정수로 변환하기
 *
 * @param n_str 숫자로만 이루어진 문자열
 * @return n_str을 정수로 변환하여 반환
 */
int solution5(const char* n_str) {
    return atoi(n_str);
}

int main(void) {
    printf("%d\n", solution3(1.42));
    printf("%d\n", solution3(69.32));

    printf("%d\n", solution5("10"));
    printf("%d\n", solution5("8542"));

    return 0;
}
