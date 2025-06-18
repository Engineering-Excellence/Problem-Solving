/**
 * Alea Iacta Est
 *
 * @file boj_33046.cpp
 * @brief 몇 번 플레이어가 진동이 되는지 출력
 * @author Kyle
 * @date 2025-06-18
 */

#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int a, b, c, d;
    cin >> a >> b >> c >> d;
    cout << (a + b + c + d - 2) % 4 + 1;

    return 0;
}