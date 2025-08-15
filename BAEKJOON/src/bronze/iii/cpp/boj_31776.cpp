/**
 * 예비 소집 결과 보고서
 *
 * @file boj_31776.cpp
 * @brief 예비 소집에 성실하게 참여한 팀의 수를 출력
 * @author Kyle
 * @date 2025-08-15
 */

#include <iostream>
#include <array>

using namespace std;

int N;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    int cnt{0};

    cin >> N;

    for (int i{0}; i < N; ++i) {
        array<int, 3> T{};
        cin >> T[0] >> T[1] >> T[2];

        if (T[0] == -1) continue;
        else {
            for (int j{1}; j < 3; ++j)
                if (T[j] == -1) T[j] = INT32_MAX;

            if (T[0] <= T[1] && T[1] <= T[2]) ++cnt;
        }
    }

    cout << cnt;

    return 0;
}