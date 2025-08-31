/**
 * 병영외 급식
 *
 * @file boj_30204.cpp
 * @brief 모든 병사가 행복하게 병영외 급식을 즐길 수 있다면 1, 없다면 0을 출력
 * @author Kyle
 * @date 2025-08-31
 */

#include <iostream>

using namespace std;

int N, X;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N >> X;

    int sum = 0;
    for (int i = 0; i < N; ++i) {
        int p;
        cin >> p;
        sum += p;
    }

    cout << (sum % X == 0);

    return 0;
}