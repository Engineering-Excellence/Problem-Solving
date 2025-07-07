/**
 * 반지
 *
 * @file boj_5555.cpp
 * @brief 찾고자하는 문자열을 포함하는 반지의 개수를 출력
 * @author Kyle
 * @date 2025-07-07
 */

#include <iostream>
#include <string>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    string str, ring;
    int N, cnt = 0;

    cin >> str >> N;

    for (int i = 0; i < N; ++i) {
        cin >> ring;
        ring += ring;
        if (ring.find(str) != string::npos)
            cnt++;
    }

    cout << cnt;

    return 0;
}