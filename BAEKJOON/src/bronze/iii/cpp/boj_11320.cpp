/**
 * 삼각 무늬 - 1
 *
 * @file boj_11320.cpp
 * @brief 한 변의 길이가 A인 정삼각형을 완벽하게 덮을 수 있는 한 변의 길이가 B인 정삼각형의 최소 개수를 출력
 * @author Kyle
 * @date 2025-08-14
 */

#include <iostream>
#include <cmath>

using namespace std;

int T;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> T;

    for (int i = 0; i < T; ++i) {
        int A, B;
        cin >> A >> B;
        cout << static_cast<int>(pow((A / B), 2)) << '\n';
    }

    return 0;
}