/**
 * @file boj_31429.c
 * @brief SUAPC 2023 Summer
 *
 * @author Kyle
 * @date 2025-06-01
 */

#include <stdio.h>

int main(void) {
    int n;
    int scores[11][2] = {{12, 1600},
                        {11, 894},
                        {11, 1327},
                        {10, 1311},
                        {9,  1004},
                        {9,  1178},
                        {9,  1357},
                        {8,  837},
                        {7,  1055},
                        {6,  556},
                        {6,  773}};

    scanf("%d", &n);
    printf("%d %d", scores[n - 1][0], scores[n - 1][1]);

    return 0;
}