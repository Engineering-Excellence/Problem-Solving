/**
 * 문어
 *
 * @file boj_21313.cpp
 * @brief N마리의 문어들로 만들 수 있는 길이 N의 수열 중 사전순으로 가장 앞서는 것을 출력
 * @author Kyle
 * @date 2025-08-30
 */

#include <iostream>

using namespace std;

int N;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N;

    for (int i = 0; i < N / 2; ++i)
        cout << "1 2 ";
    if (N % 2) cout << '3';

    return 0;
}