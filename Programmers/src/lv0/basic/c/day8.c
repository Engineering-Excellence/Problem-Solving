// 조건문, 문자열
#include <stdio.h>
#include <stdbool.h>

// 간단한 논리 연산
bool simple_boolean_operation(bool x1, bool x2, bool x3, bool x4) {
    return (x1 || x2) & (x3 || x4);
}

int main(void) {
    printf("%d\n", simple_boolean_operation(0, 1, 1, 1));
    printf("%d\n", simple_boolean_operation(1, 0, 0, 0));
    return 0;
}
