/**
 * 치킨댄스를 추는 곰곰이를 본 임스 2
 *
 * @file boj_26068.cpp
 * @brief 임스가 사용할 기프티콘의 개수를 출력
 * @author Kyle
 * @date 2025-07-31
 */

#include <iostream>

using namespace std;

int N;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N;

    int cnt{0};

    for (int i{0}; i < N; ++i) {
        char D, dash;
        int days;
        cin >> D >> dash >> days;
        if (days <= 90) cnt++;
    }

    cout << cnt;

    return 0;
}