/**
 * 임스의 메이플컵
 *
 * @file boj_29790.cpp
 * @brief 조건을 모두 만족하면 Very Good을, 백준의 대회 출제 조건만 만족하면 Good을, 만족하지 못하면 Bad를 출력
 * @author Kyle
 * @date 2025-07-11
 */

#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int N, U, L;
    cin >> N >> U >> L;

    if (N >= 1000) {
        if (U >= 8000 || L >= 260)
            cout << "Very Good";
        else
            cout << "Good";
    } else
        cout << "Bad";

    return 0;
}