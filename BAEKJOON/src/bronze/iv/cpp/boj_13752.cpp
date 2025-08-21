/**
 * 히스토그램
 *
 * @file boj_13752.cpp
 * @brief 히스토그램의 크기 k와 동일한 수의 '='를 출력
 * @author Kyle
 * @date 2025-08-21
 */

#include <iostream>

using namespace std;

int n;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> n;
    for (int i = 0; i < n; ++i) {
        int k;
        cin >> k;
        for (int j = 0; j < k; ++j)
            cout << '=';
        cout << '\n';
    }

    return 0;
}