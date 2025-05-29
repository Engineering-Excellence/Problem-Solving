/**
 * @file boj_20499.c
 * @brief Darius님 한타 안 함?
 *
 * 아무래도 우리 팀 다리우스가 고수인 것 같다. 그의 K/D/A를 보고 그가 「진짜」인지 판별해 보자.
 * K + A < D이거나, D = 0 이면 그는 「가짜」이고, 그렇지 않으면 「진짜」이다.
 *
 * @author Kyle
 * @date 2025-05-14
 */

#include <stdio.h>

/**
 * @brief 그가 「진짜」이면 gosu, 「가짜」이면 hasu를 출력한다.
 *
 * @param k 처치 수(Kill count)
 * @param d 데스 수(Death count)
 * @param a 도움 수(Assist count)
 * @return int 프로그램 종료 상태
 */
int main() {
    int k, d, a;

    scanf("%d/%d/%d", &k, &d, &a);
    puts(k + a < d || d == 0 ? "hasu" : "gosu");

    return 0;
}
