/**
 * 젓가락 게임
 *
 * @file boj_25642.cpp
 * @brief 용태와 유진이가 게임을 플레이했을 때 용태가 이기게 된다면 yt를, 유진이가 이긴다면 yj를 출력
 * @author Kyle
 * @date 2025-06-11
 */

#include<iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int a, b;
    cin >> a >> b;

    while (a < 5 && b < 5) {
        b += a;
        if (b >= 5)
            break;

        a += b;
        if (a >= 5)
            break;
    }

    cout << (a < b ? "yt" : "yj");

    return 0;
}