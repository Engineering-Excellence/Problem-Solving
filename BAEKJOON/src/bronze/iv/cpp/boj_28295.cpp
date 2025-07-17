/**
 * 체육은 코딩과목 입니다
 *
 * @file boj_28295.cpp
 * @brief 10개의 지시를 모두 이행한 후 학생들이 바라보는 방향을 나타내는 문자를 출력
 * @author Kyle
 * @date 2025-07-17
 */

#include <iostream>
#include <array>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    array<char, 4> dirs{'N', 'E', 'S', 'W'};
    int t, dir{0};

    for (int i{0}; i < 10; ++i) {
        cin >> t;
        dir += t;
    }

    cout << dirs[dir % 4];

    return 0;
}