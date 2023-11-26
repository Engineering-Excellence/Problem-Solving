// 조건문, 문자열
#include <stdio.h>
#include <stdbool.h>

// 간단한 논리 연산
bool solution(bool x1, bool x2, bool x3, bool x4) {
    return (x1 || x2) & (x3 || x4);
}

int main(void) {
    printf("%d\n", solution(0, 1, 1, 1));
    printf("%d\n", solution(1, 0, 0, 0));
    return 0;
}
