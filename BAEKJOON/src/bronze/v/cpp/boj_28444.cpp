/**
 * HI-ARC=?
 *
 * @file boj_28444.cpp
 * @brief 수식을 계산한 결과값을 출력
 * @author Kyle
 * @date 2025-08-27
 */

#include <iostream>

using namespace std;

int H, I, A, R, C;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> H >> I >> A >> R >> C;
    cout << H * I - A * R * C;

    return 0;
}