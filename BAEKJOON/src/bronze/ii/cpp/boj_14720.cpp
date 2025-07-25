/**
 * 우유 축제
 *
 * @file boj_14720.cpp
 * @brief 영학이가 마실 수 있는 우유의 최대 개수를 출력
 * @author Kyle
 * @date 2025-07-25
 */

#include <iostream>

using namespace std;

int N;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N;
    int cnt = 0, milk = 0;

    for (int i = 0; i < N; ++i) {
        int shop;
        cin >> shop;

        if (milk == shop) {
            milk = ++milk % 3;
            ++cnt;
        }
    }

    cout << cnt;

    return 0;
}