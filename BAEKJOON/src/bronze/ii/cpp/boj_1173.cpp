/**
 * 운동
 *
 * @file boj_1173.cpp
 * @brief 운동을 N분하는데 필요한 시간의 최솟값을 출력
 * @author Kyle
 * @date 2025-07-04
 */

#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int N, m, M, T, R;  // 목표시간, 초기 맥박, 한계 맥박, 운동시간당 맥박 증가량, 휴식시간당 맥박 감소량

    cin >> N >> m >> M >> T >> R;

    if (m + T > M) {    // 목표시간을 채울 수 없는 경우
        cout << -1;
        return 0;
    }

    int p = m, t = 0, n = 0;    // 현재 맥박, 경과시간, 운동시간

    while (n < N) {
        t++;
        if (p + T <= M) {   // 한계 맥박 이하면 운동을 1분 하고 현재 맥박이 증가
            n++;
            p += T;
        } else
            p = max(p - R, m);  // 맥박은 절대로 m보다 낮아지면 안 됨
    }

    cout << t;

    return 0;
}