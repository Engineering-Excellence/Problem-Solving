/**
 * 별 찍기 - 20
 *
 * @file boj_10995.cpp
 * @brief 첫째 줄부터 차례대로 별을 출력
 * @author Kyle
 * @date 2025-08-07
 */

#include <iostream>

using namespace std;

int N;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N;

    for (int i = 0; i < N; ++i) {
        if (i % 2) cout << ' ';
        for (int j = 0; j < N; ++j) {
            cout << "* ";
        }
        cout << '\n';
    }

    return 0;
}