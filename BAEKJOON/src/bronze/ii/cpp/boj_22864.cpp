/**
 * 피로도
 *
 * @file boj_22864.cpp
 * @brief 하루에 번 아웃이 되지 않도록 일을 할 때 최대 얼마나 많은 일을 할 수 있는지 출력
 * @author Kyle
 * @date 2025-08-23
 */

#include <iostream>

using namespace std;

int A, B, C, M;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int work = 0, fatigue = 0;

    cin >> A >> B >> C >> M;

    for (int i = 0; i < 24; ++i) {
        if (fatigue + A <= M) {
            fatigue += A;
            work += B;
        } else fatigue = max(0, fatigue - C);
    }

    cout << work;

    return 0;
}