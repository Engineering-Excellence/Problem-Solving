#include <stdio.h>

/**
 * 네 번째 점
 *
 * @file boj_3009.c
 * @brief 직사각형의 네 번째 점의 좌표를 출력한다.
 * @author Kyle
 * @date 2025-06-05
 */
int main(void) {
    int x = 0, y = 0, tx, ty;

    for (int i = 0; i < 3; ++i) {   // z ^ z == 0 이므로 x ^ z ^ z == x
        scanf("%d %d", &tx, &ty);
        x ^= tx;
        y ^= ty;
    }

    printf("%d %d", x, y);

    return 0;
}