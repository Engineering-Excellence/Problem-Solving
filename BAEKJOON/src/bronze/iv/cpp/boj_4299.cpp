/**
 * AFC 윔블던
 *
 * @file boj_4299.cpp
 * @brief 두 팀의 경기 결과를 득점을 많이 한 쪽부터 먼저 출력
 * @author Kyle
 * @date 2025-09-11
 */

#include<iostream>

using namespace std;

int sum, sub, a, b;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> sum >> sub;

    a = (sum + sub) / 2;
    b = (sum - sub) / 2;

    if (sum >= sub && sum == a + b && sub == a - b) cout << a << ' ' << b;
    else cout << -1;

    return 0;
}