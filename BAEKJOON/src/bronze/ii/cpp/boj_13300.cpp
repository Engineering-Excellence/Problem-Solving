/**
 * 방 배정
 *
 * @file boj_13300.cpp
 * @brief 학생들을 모두 배정하기 위해 필요한 최소한의 방의 수를 출력
 * @author Kyle
 * @date 2025-07-13
 */

#include <iostream>
#include <cmath>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int students[2][7]{0};
    int N, K, cnt = 0;
    cin >> N >> K;

    for (int i = 0; i < N; ++i) {
        int S, Y;
        cin >> S >> Y;
        students[S][Y]++;
    }

    for (int s = 0; s < 2; ++s)
        for (int y = 1; y < 7; ++y)
            cnt += ceil(students[s][y] / static_cast<double>(K));

    cout << cnt;

    return 0;
}