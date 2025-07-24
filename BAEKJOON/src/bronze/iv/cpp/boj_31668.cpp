/**
 * 특별한 가지
 *
 * @file boj_31668.cpp
 * @brief 학생들이 구매해야 하는 가지의 양의 최솟값을 그램 단위로 출력
 * @author Kyle
 * @date 2025-07-24
 */

#include <iostream>

using namespace std;

int N, M, K;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N >> M >> K;
    cout << K * M / N;

    return 0;
}