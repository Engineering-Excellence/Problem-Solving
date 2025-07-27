/**
 * 드높은 남산 위에 우뚝 선
 *
 * @file boj_21965.cpp
 * @brief 입력으로 주어진 수열 A가 산이면 "YES"를, 산이 아니면 "NO"를 출력
 * @author Kyle
 * @date 2025-07-27
 */

#include <iostream>

using namespace std;

int N;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N;

    int A[N];
    bool down = false;

    cin >> A[0];
    for (int i = 1; i < N; ++i) {
        cin >> A[i];
        if (A[i - 1] == A[i] || (down && A[i - 1] < A[i])) {
            cout << "NO";
            return 0;
        } else if (A[i - i] > A[i]) down = true;
    }

    cout << "YES";

    return 0;
}