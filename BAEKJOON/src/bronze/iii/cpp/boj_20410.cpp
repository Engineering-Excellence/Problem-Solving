/**
 * 추첨상 사수 대작전! (Easy)
 *
 * @file boj_20410.cpp
 * @brief 준표가 비밀리에 선정한 정수 a, c를 출력한다. 가능한 답이 여러 개라면, 그중 아무거나 출력한다.
 * @author Kyle
 * @date 2025-06-12
 */

#include<iostream>

using namespace std;

int m, seed, x1, x2;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> m >> seed >> x1 >> x2;

    for (int a = 0; a < m; ++a) {
        for (int c = 0; c < m; ++c) {
            if ((a * seed + c) % m == x1 && (a * x1 + c) % m == x2) {
                cout << a << " " << c;
                return 0;
            }
        }
    }
}