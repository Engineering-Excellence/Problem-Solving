/**
 * 전자레인지
 *
 * @file boj_14470.cpp
 * @brief 고기를 데우는 데 걸리는 시간을 초 단위로 출력
 * @author Kyle
 * @date 2025-08-06
 */

#include <iostream>

using namespace std;

int A, B, C, D, E;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> A >> B >> C >> D >> E;

    if (A > 0) cout << (B - A) * E;
    else cout << -A * C + D + B * E;

    return 0;
}