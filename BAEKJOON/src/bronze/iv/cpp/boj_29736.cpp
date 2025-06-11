/**
 * 브실이와 친구가 되고 싶어
 *
 * @file boj_29736.cpp
 * @brief 브실이의 친구가 될 수 있는 사람의 수를 출력
 * @author Kyle
 * @date 2025-06-11
 */

#include<iostream>

using namespace std;

int a, b, k, x;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> a >> b;
    cin >> k >> x;

    if (k + x < a || k - x > b)
        cout << "IMPOSSIBLE";
    else
        cout << min(k + x, b) - max(k - x, a) + 1;

    return 0;
}