/**
 * 일우는 야바위꾼
 *
 * @file boj_20361.cpp
 * @brief 공이 몇 번째 위치의 컵에 있어야 하는지 정수로 출력
 * @author Kyle
 * @date 2025-09-12
 */

#include <iostream>

using namespace std;

int N, X, K;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N >> X >> K;

    for (int i = 0; i < K; ++i) {
        int A, B;
        cin >> A >> B;
        if (A == X) X = B;
        else if (B == X) X = A;
    }

    cout << X;

    return 0;
}