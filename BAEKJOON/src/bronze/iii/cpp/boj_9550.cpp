/**
 * 아이들은 사탕을 좋아해
 *
 * @file boj_9550.cpp
 * @brief 생일파티에 최대 몇 명의 아이들이 참석할 수 있는지 하나의 정수로 출력
 * @author Kyle
 * @date 2025-08-08
 */

#include <iostream>

using namespace std;

int T, N, K;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> T;

    for (int i = 0; i < T; ++i) {
        int children = 0;
        cin >> N >> K;

        for (int j = 0; j < N; ++j) {
            int candy;
            cin >> candy;
            children += candy / K;
        }

        cout << children << '\n';
    }

    return 0;
}