#include <stdio.h>

/**
 * 홀수
 *
 * @file boj_2576.c
 * @brief 홀수가 존재하는 경우 첫째 줄에 홀수들의 합을 출력하고, 둘째 줄에 홀수들 중 최솟값을 출력한다.
 * @author Kyle
 * @date 2025-06-05
 */
int main(void) {
    unsigned sum = 0, min = 100, tmp;

    for (int i = 0; i < 7; ++i) {
        scanf("%d", &tmp);
        if (tmp & 0x1) {    // 최하위 비트 단위 AND 연산으로 홀수 판별
            min = min > tmp ? tmp : min;
            sum += tmp;
        }
    }

    if (sum)
        printf("%d\n%d", sum, min);
    else
        puts("-1");

    return 0;
}