/**
 * <h1>Day 23 조건문 활용</h1>
 * Programmers 코딩 기초 트레이닝
 *
 * @author Kyle
 * @since 2024.01.10.
 */
#include <stdio.h>
#include <string.h>

/**
 * 부분 문자열
 *
 * @param str1 문자열
 * @param str2 문자열
 * @return str1이 str2의 부분 문자열이라면 1을 부분 문자열이 아니라면 0을 반환
 */
int solution(const char* str1, const char* str2) {
    return strstr(str2, str1) != NULL;
}

int main(void) {
    printf("%d\n", solution("abc", "aabcc"));
    printf("%d\n", solution("tbt", "tbbttb"));

    return 0;
}
