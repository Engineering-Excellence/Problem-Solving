/**
 * 팀 나누기
 *
 * @file boj_13866.cpp
 * @brief 두 팀의 스킬 레벨 차이의 최솟값을 출력
 * @author Kyle
 * @date 2025-07-09
 */

#include <iostream>
#include <array>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    array<int, 4> levels{};
    for (int i = 0; i < 4; i++) {
        cin >> levels[i];
    }
//    sort(levels.begin(), levels.end(), less<>());

    cout << abs(levels[0] + levels[3] - levels[1] - levels[2]);

    return 0;
}