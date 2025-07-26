/**
 * 차량 번호판 1
 *
 * @file boj_16968.cpp
 * @brief 가능한 차량 번호판의 개수를 출력
 * @author Kyle
 * @date 2025-07-26
 */

#include <iostream>

using namespace std;

string form;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int ans = 1;

    cin >> form;

    for (int i = 0; i < form.length(); ++i)
        ans *= (form[i] == 'c' ? 26 : 10) - (i > 0 && form[i] == form[i - 1]);

    cout << ans;

    return 0;
}