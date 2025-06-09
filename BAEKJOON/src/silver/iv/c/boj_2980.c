/**
 * 도로와 신호등
 *
 * @file boj_2980.c
 * @brief 첫째 줄에 상근이가 도로의 끝까지 이동하는데 걸리는 시간을 출력한다.
 * @author Kyle
 * @date 2025-06-10
 */

#include <stdio.h>

int main(void) {
    int n, l, d, r, g, pos = 0, t = 0;

    scanf("%d %d", &n, &l);

    for (int i = 0; i < n; ++i) {
        scanf("%d %d %d", &d, &r, &g);

        t += d - pos;
        pos = d;

        if (t % (r + g) < r) {
            t += r - t % (r + g);
        }
    }

    printf("%d", t + l - pos);

    return 0;
}